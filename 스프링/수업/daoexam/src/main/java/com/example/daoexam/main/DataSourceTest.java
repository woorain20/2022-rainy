package com.example.daoexam.main;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.daoexam.config.ApplicationConfig;

public class DataSourceTest {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(ApplicationConfig.class);	//Ioc와 DI 해줌
		DataSource ds=ac.getBean(DataSource.class);
		Connection conn=null;
		try {
			conn=ds.getConnection();		//연결 예외 확률이 높으므로 try/catch로 씌워야 함
			if(conn!=null) {
				System.out.println("접속성공");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {						//연결 닫아주는 것이 필요
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
