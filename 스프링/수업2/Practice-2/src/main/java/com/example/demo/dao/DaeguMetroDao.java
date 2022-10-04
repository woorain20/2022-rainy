package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.DaeguMetro;
import com.example.demo.repository.DaeguMetroRepository;

@Repository
public class DaeguMetroDao {

	@Autowired
	private DaeguMetroRepository daeguRepository;
	
	public DaeguMetro putDaeguMetro(DaeguMetro daeguMetro) {
		return daeguRepository.saveAndFlush(daeguMetro);
	}
	
	//전체 조회
	public List<DaeguMetro> getDaeguMetros(){
		return daeguRepository.findAll();
	}
	
	//페이지당 조회
	public List<DaeguMetro> getDaeguMetroSome(Integer page, Integer limit){
		Pageable pageable=PageRequest.of(page, limit, Sort.by("id").descending());
		return daeguRepository.findAll(pageable).getContent();
//		PageRequest pageRequest=PageRequest.of(page, limit);	//1페이지에 불러오는 데이터 수
//		List<DaeguMetro> daegus=new ArrayList();
//		daeguRepository.findAll(pageRequest).forEach(d->daegus.add(d));
//		return daegus;
	}
	
	//게시물 수 확인
	public int getDaeguMetroSize() {
		return (int) daeguRepository.count();
	}
	
	//삭제
	public void deleteDaeguMetro(int id) {
		daeguRepository.deleteById(id);
	}
}
