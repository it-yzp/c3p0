package com.zhanpeng.springboot.domain;

public class Notice {
	 private Integer id; // bigint(20) NOT NULL AUTO_INCREMENT,
	 private String content; // longtext,
	 private String title; // varchar(200) DEFAULT NULL,
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	 
	 
}
