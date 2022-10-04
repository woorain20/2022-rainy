package com.example.demo.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DbConfig {
	
	private String driverClassName="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/footballdb?useUnicode=true&characterEncoding=utf8";	//unicode는 mysql에서 한글깨지는 경우 있어서
	private String username="fcuser";
	private String password="2022";
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		return dataSource;
	}
}
