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
	
	@GetMapping("/toList")
	public String toList(){
		return "html/notice.html";
	}
	
	
	@PostMapping("/findByPage")
	@ResponseBody
	public Map<String,Object> findByPage(@RequestParam(name="page",defaultValue="1")Integer page
			,@RequestParam(name="rows",defaultValue="5")Integer rows){
		
		return noticeServer.findByPage((page-1)*rows,rows);
	}
	
}
