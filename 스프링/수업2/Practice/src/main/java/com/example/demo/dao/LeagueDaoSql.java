package com.example.demo.dao;

public class LeagueDaoSql {

	//목록 조회
	public static final String SELECT_ALL="select * from league";
	
	//수정
	public static final String UPDATE="update role set league=:league where idleague=:idleague";
	
	//1개 조회
	public static final String SELECT_BY_IDLEAGUE="select * from league where idleague=:idleague";
	
	//1개 삭제
	public static final String DELETE_BY_IDLEAGUE="delete from league where idleague=:idleague";
}
