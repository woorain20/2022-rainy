package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.SeoulMetro;
import com.example.demo.repository.SeoulMetroRepository;

@Repository
public class SeoulMetroDao {

	@Autowired
	private SeoulMetroRepository seoulRepository;
	
	public SeoulMetro putSeoulMetro(SeoulMetro seoulMetro) {
		return seoulRepository.saveAndFlush(seoulMetro);
	}
	//전체 조회
	public List<SeoulMetro> getSeoulMetros(){
		return seoulRepository.findAll();
	}
	
	//페이지당 조회
	public List<SeoulMetro> getSeoulMetroSome(Integer page, Integer limit){
		Pageable pageable=PageRequest.of(page, limit, Sort.by("id").descending());
		return seoulRepository.findAll(pageable).getContent();
//		PageRequest pageRequest=PageRequest.of(page, limit);	//1페이지에 불러오는 데이터 수
//		List<SeoulMetro> seouls=new ArrayList();
//		seoulRepository.findAll(pageRequest).forEach(s->seouls.add(s));
//		return seouls;
	}
	
	//게시물 수 확인
	public int getSeoulMetroSize() {
		return (int) seoulRepository.count();
	}
	
	//삭제
	public void deleteSeoulMetro(int id) {
		seoulRepository.deleteById(id);
	}
}
