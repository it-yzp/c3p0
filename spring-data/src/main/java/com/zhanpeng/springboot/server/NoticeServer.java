package com.zhanpeng.springboot.server;

import java.util.List;
import java.util.Map;

import com.zhanpeng.springboot.domain.Notice;

public interface NoticeServer {

	List<Notice> findAll();

}
