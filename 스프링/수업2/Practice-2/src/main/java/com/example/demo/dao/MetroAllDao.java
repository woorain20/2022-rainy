package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.MetroAll;
import com.example.demo.repository.MetroAllRepository;

@Repository
public class MetroAllDao {

	@Autowired
	private MetroAllRepository metroAllRepository;
	
	
	public MetroAll putMetroAll(MetroAll metroAll) {
		return metroAllRepository.saveAndFlush(metroAll);
	}
	
	//전체 조회
	public List<MetroAll> getMetroAlls(){
		return metroAllRepository.findAll();
	}
	
	//페이지당 조회
	public List<MetroAll> getMetroAllSome(Integer page, Integer limit){
		Pageable pageable=PageRequest.of(page, limit, Sort.by("id").descending());
		return metroAllRepository.findAll(pageable).getContent();
//		PageRequest pageRequest=PageRequest.of(page, limit);	//1페이지에 불러오는 데이터 수
//		List<MetroAll> metroAlls=new ArrayList();
//		metroAllRepository.findAll(pageRequest).forEach(m->metroAlls.add(m));
//		return metroAlls;
	}
	
	//게시물 수 확인
	public int getMetroAllSize() {
		return (int) metroAllRepository.count();
	}
	
	//삭제
	public void deleteMetroAll(int id) {
		metroAllRepository.deleteById(id);
	}
}
