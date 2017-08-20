package com.zhanpeng.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zhanpeng.springboot.domain.Notice;
@Repository
public interface NoticeDao extends JpaRepository<Notice, Integer>{

}
