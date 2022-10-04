package com.example.demo.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.GuestbookDao;
import com.example.demo.dao.LogDao;
import com.example.demo.dto.Guestbook;
import com.example.demo.dto.Log;
import com.example.demo.service.GuestbookService;

@Service
public class GuestbookServiceImpl implements GuestbookService {

	@Autowired
	GuestbookDao guestbookDao;
	
	@Autowired
	LogDao logDao;
	
	@Override
	public List<Guestbook> getGuestbooks(Integer page) {
		return guestbookDao.getGuestbooksSome(page, GuestbookService.LIMIT);
	}

	@Override
	@Transactional(readOnly=false)	//Transactional이 있으면 하나의 일의 단위가 됨 그래서 도중 에러가 발생하면 일이 진행되지 않음. 없으면 에러 부분 제외하고 진행됨
	public void deleteGuestbook(Long id, String ip) {
		guestbookDao.deleteGuestbook(id);
		Log log=new Log();
		log.setIp(ip);
		log.setMethod("delete");
		log.setRegdate(new Date());
		logDao.putLog(log);
	}

	@Override
	@Transactional(readOnly=false)
	public Guestbook putGuestbook(Guestbook guestbook, String ip) {
		guestbook.setRegdate(new Date());
		Guestbook sGuestbook=guestbookDao.putGuestbook(guestbook);
		Log log=new Log();
		log.setIp(ip);
		log.setMethod("put");
		log.setRegdate(new Date());
		logDao.putLog(log);
		return sGuestbook;
	}

	@Override
	public int getGuestbookSize() {
		return guestbookDao.getGuestbooksSize().intValue();
	}

}
