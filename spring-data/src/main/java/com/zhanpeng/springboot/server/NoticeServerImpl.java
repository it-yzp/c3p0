package com.zhanpeng.springboot.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhanpeng.springboot.dao.NoticeDao;
import com.zhanpeng.springboot.domain.Notice;
@Service
@Transactional
public class NoticeServerImpl implements NoticeServer {
	@Autowired
	private NoticeDao noticeDao;
	
	@Override
	public List<Notice> findAll() {
		return noticeDao.findAll();
	}

	

}
