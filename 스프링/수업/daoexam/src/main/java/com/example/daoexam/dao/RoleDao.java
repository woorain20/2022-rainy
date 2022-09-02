package com.example.daoexam.dao;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.daoexam.dto.Role;
import static com.example.daoexam.dao.RoleDaoSqls.*;

@Repository	//component, service, controller -> 가능하나 데이터 저장과 관련되어 있으므로 Repository에 저장 
public class RoleDao {
	
	private NamedParameterJdbcTemplate jdbc; //쿼리값이 다수면 자동으로 List로 저장됨
	private RowMapper<Role> rowMapper = BeanPropertyRowMapper.newInstance(Role.class);  //매칭을 시켜 dto에 있는 변수로 연결 RowMapper는 스프링, Role.class는 dto의 Role 클래스
	private SimpleJdbcInsert insertAction;
	
	public RoleDao(DataSource dataSource) {
		this.jdbc=new NamedParameterJdbcTemplate(dataSource);
		this.insertAction=new SimpleJdbcInsert(dataSource).withTableName("role");
	}
	
	public List<Role> selectAll(){
		return jdbc.query(SELECT_ALL, Collections.emptyMap(),rowMapper);	//첫번째에는 select문, 두번째는 콜렉션
	}
	//결과값 추가하는 것
	public int insert(Role role) {
		SqlParameterSource params=new BeanPropertySqlParameterSource(role);
		return insertAction.execute(params);
	}
	//수정
	public int update(Role role) {
		SqlParameterSource params=new BeanPropertySqlParameterSource(role);
		return jdbc.update(UPDATE, params);
	}
	//읽기
	public Role selectById(int roleId) {
		try {
			//<> - 제네릭
			//<?> ? - 와일드카드(데이터 타입을 미리 정하지 않겠다는 것, 어떠한 데이터 타입도 들어올 수 있음)
			//? 위치에 int값이 자동으로 Integer로 변환 -> 오토박싱
			Map<String, ?> params=Collections.singletonMap("roleId", roleId);
			return jdbc.queryForObject(SELECT_BY_ROLE_ID, params, rowMapper);		
		}catch(EmptyResultDataAccessException e){
			return null;
		}
	}
	//삭제
	public int deleteById(Integer roleId) {
		Map<String, ?> params=Collections.singletonMap("roleId", roleId);
		return jdbc.update(DELETE_BY_ROLE_ID, params);
	}
}
