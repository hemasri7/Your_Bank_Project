package com.axis.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="posts")
public class Posts {
	@Id
	private String id;
	private Map<String,String> desc=new HashMap<String,String>();
	private String imgText;
	private String img;
	private int likes;
	//private Timestamp createdAt=new Timestamp(System.currentTimeMillis());
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Map<String,String> getDesc() {
		return desc;
	}
	public void setDesc(Map<String,String> desc) {
		this.desc = desc;
	}
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public String getImgText() {
		return imgText;
	}
	public void setImgText(String imgText) {
		this.imgText = imgText;
	}
	//	public Timestamp getCreatedAt() {
//		return createdAt;
//	}
//	public void setCreatedAt(Timestamp createdAt) {
//		this.createdAt = createdAt;
//	}
	public Posts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Posts(Map<String,String> desc, String img, int likes, String id,String imgText) {
		super();
		this.desc = desc;
		this.img = img;
		this.likes = likes;
		//this.createdAt = createdAt;
		this.id=id;
		this.imgText=imgText;
	}
//	public Posts(String desc, String img, int likes,String id) {
//		super();
//		this.desc = desc;
//		this.img = img;
//		this.likes = likes;
//		this.id=id;
//		//this.createdAt = createdAt;
//	}
	public Posts(Map<String,String> desc,String id) {
		this.desc = desc;
		this.id=id; 
	}
}
