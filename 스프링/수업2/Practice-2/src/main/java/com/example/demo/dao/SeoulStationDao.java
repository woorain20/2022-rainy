package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.SeoulStation;
import com.example.demo.repository.SeoulStationRepository;

@Repository
public class SeoulStationDao {

	@Autowired
	private SeoulStationRepository seoulStationRepository;
	
	public SeoulStation putSeoulStation(SeoulStation seoulstation) {
		return seoulStationRepository.saveAndFlush(seoulstation);
	}
	
	//전체 조회
	public List<SeoulStation> getSeoulStations(){
		return seoulStationRepository.findAll();
	}
	
	//페이지당 조회
	public List<SeoulStation> getSeoulStationSome(Integer page, Integer limit){
		Pageable pageable=PageRequest.of(page, limit, Sort.by("id").descending());
		return seoulStationRepository.findAll(pageable).getContent();
//		PageRequest pageRequest=PageRequest.of(page, limit);	//1페이지에 불러오는 데이터 수
//		List<SeoulStation> seoulStations=new ArrayList();
//		seoulStationRepository.findAll(pageRequest).forEach(s->seouls.add(s));
//		return seoulStations;
	}
	
	//게시물 수 확인
	public int getSeoulStationSize() {
		return (int) seoulStationRepository.count();
	}
	
	//삭제
	public void deleteSeoulStation(int id) {
		seoulStationRepository.deleteById(id);
	}
}
