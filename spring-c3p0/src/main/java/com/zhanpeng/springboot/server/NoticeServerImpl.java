package com.zhanpeng.springboot.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zhanpeng.springboot.domain.Notice;
import com.zhanpeng.springboot.mapper.NoticeMapper;
@Service
@Transactional
public class NoticeServerImpl implements NoticeServer {
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}

	@Override
	public Map<String, Object> findByPage(Integer i, Integer rows) {
		Map<String,Object> map = new HashMap<>();
		int total = noticeMapper.count();
		map.put("total", total);
		List<Notice> list = noticeMapper.findByPage(i,rows);
		map.put("rows", list);
		return map;
	}

}
