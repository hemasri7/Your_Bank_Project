package com.axis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.model.LiveProject;
import com.axis.repository.LiveProjectRepository;
@Service
public class LiveProjectServiceImpl implements LiveProjectService {
	@Autowired
	private LiveProjectRepository liveProjectRepository;
	@Override
	public LiveProject add(LiveProject liveProject) {
		LiveProject live1=liveProjectRepository.save(liveProject);
		return live1;
	}

	@Override
	public List<LiveProject> getall() {
		List<LiveProject> all=liveProjectRepository.findAll();
		return all;
	}

	@Override
	public LiveProject getByProj(String projId) {
		LiveProject like2=liveProjectRepository.findById(projId).orElseThrow();
		return like2;
	}

	@Override
	public LiveProject update(String projId, LiveProject liveProject) {
		LiveProject like3=liveProjectRepository.findById(projId).orElseThrow();
		like3.setProjName(liveProject.getProjName());
		like3.setProjDescription(liveProject.getProjDescription());
		like3.setProjOwner(liveProject.getProjOwner());
		like3.setProjOwnerDescription(liveProject.getProjOwnerDescription());
		like3.setProjOwnerImg(liveProject.getProjOwnerImg());
		like3.setProjImg(liveProject.getProjImg());
		like3.setProjFlowChartImg(liveProject.getProjFlowChartImg());
		return liveProjectRepository.save(like3);
	}

	@Override
	public String delete(String projId) {
		LiveProject like=liveProjectRepository.findById(projId).orElseThrow();
		String str;
		if(like!=null) {
			liveProjectRepository.delete(like);
			str="Delete Successfully";
		}
		else {
			str="Failed";
		}
		return str;
	}

	@Override
	public LiveProject search(String projName) {
		LiveProject like4=liveProjectRepository.findByProjName(projName);
		return like4;
	}

}
