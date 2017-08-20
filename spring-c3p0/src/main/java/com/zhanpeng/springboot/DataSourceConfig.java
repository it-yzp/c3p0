package com.zhanpeng.springboot;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration//定义配置信息类，运行立刻加载
public class DataSourceConfig {
	
	@Bean(name="dataSource")//定义Bean
	@Primary//主要候选者
	@ConfigurationProperties(prefix="spring.datasource.c3p0")//配置属性
	public DataSource getDataSource(){
		System.out.println("C3p0加载！");
		
		return DataSourceBuilder.create()
				.type(ComboPooledDataSource.class)
				.build();
	}

}
