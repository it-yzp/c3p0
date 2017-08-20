package com.zhanpeng.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.zhanpeng.springboot.domain.Notice;

@Mapper
public interface NoticeMapper {

	@Select("select * from notice")
    public	List<Notice> findAll();

	public int count();

	public List<Notice> findByPage(@Param("page")Integer i, @Param("rows")Integer rows);
	
}
