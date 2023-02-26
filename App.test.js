import React from 'react';
import { render } from '@testing-library/react';
import App from './App';
import { shallow,configure,mount } from 'enzyme';
import Adapter from 'enzyme-adapter-react-16';
import AccountBalance from './components/AccountBalance';
import Notification from './components/Notification';
import toJson from 'enzyme-to-json';

configure({ adapter: new Adapter()})
const userBalance={
  balance:1100,
  savingBalance:1328,
}

describe("rendering components",()=>{
  it("renders component without crash", ()=>{
    shallow(<App/>);
  });

  it("renders App component header without crash",()=>{
    const wrapper = shallow(<App/>);
    const header=(<h1 className="has-text-centered title is-1">Welcome in the personal finance app!</h1>)
    expect(wrapper.contains(header)).toEqual(true);
  }
  );

  test("renders Notification component without crash",()=>{
    shallow(<Notification/>);
  });
  
  it("renders button",()=>{
    const wrapper=mount(<AccountBalance accounts={userBalance}/>)
    const label=wrapper.find("#balance-button").text();
    expect(label).toEqual("Send 100$")
  });
});

describe("logic",()=>{
  const wrapper=mount(<AccountBalance accounts={userBalance}/>);
  const notificationWrapper=mount(<Notification balance={userBalance.balance}/>);
  wrapper.find('#balance-button').simulate("click");

  it("button click - update savings",()=>{
    const savingsValue=wrapper.find(".savings").text();
    const expectedValue=userBalance.savingBalance+100+'$';
    expect(savingsValue).toEqual(expectedValue);
  })

  it("button click -update balance",()=>{
    const balanceValue=wrapper.find(".balance").text();
    const expectedBalanceValue=userBalance.balance -100+'$';
    expect(balanceValue).toEqual(expectedBalanceValue);
  })
})
