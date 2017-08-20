package com.zhanpeng.springboot.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notice")
public class Notice {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="ID")
	 private Integer id; // bigint(20) NOT NULL AUTO_INCREMENT,
	 @Column(name="CONTENT")
	 private String content; // longtext,
	 @Column(name="TITLE")
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
