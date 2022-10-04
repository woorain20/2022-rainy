package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Guestbook;
import com.example.demo.repository.GuestbookRepository;

@Repository
public class GuestbookDao {

	@Autowired
	private GuestbookRepository guestbookRepository;
	
	public Guestbook putGuestbook(Guestbook guestbook) {
		return guestbookRepository.saveAndFlush(guestbook);
	}
	
	//전체 조회
	public List<Guestbook> getGuestbooks(){
		return guestbookRepository.findAll();
	}
	
	//페이지당 조회
	public List<Guestbook> getGuestbooksSome(Integer page, Integer limit){
		//주석 처리한 코드와 동일하며 더 줄인 것
		Pageable pageable=PageRequest.of(page, limit, Sort.by("id").descending());
		return guestbookRepository.findAll(pageable).getContent();
//		PageRequest pageRequest=PageRequest.of(page, limit);	//1페이지에 불러오는 데이터 수
//		List<Guestbook> guestbooks=new ArrayList();
//		guestbookRepository.findAll(pageRequest).forEach(g->guestbooks.add(g));
//		return guestbooks;
	}
	
	//게시물 수 확인
	public Long getGuestbooksSize() {
		return guestbookRepository.count();
	}
	
	//삭제
	public void deleteGuestbook(Long id) {
		guestbookRepository.deleteById(id);
	}
}
