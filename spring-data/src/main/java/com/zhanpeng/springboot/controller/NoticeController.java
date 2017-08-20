package com.zhanpeng.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhanpeng.springboot.domain.Notice;
import com.zhanpeng.springboot.server.NoticeServer;

@Controller
public class NoticeController {
	@Autowired
	private NoticeServer noticeServer;
	
	@GetMapping("/findAll")
	@ResponseBody
	public List<Notice> findAll(){
		
		return noticeServer.findAll();
	}
	
}
