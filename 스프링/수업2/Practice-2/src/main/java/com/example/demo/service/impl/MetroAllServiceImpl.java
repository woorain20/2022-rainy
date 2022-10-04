package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.MetroAllDao;
import com.example.demo.dto.MetroAll;
import com.example.demo.service.MetroAllService;

@Service
public class MetroAllServiceImpl implements MetroAllService {

	@Autowired
	MetroAllDao metroAllDao;
	
	@Override
	public List<MetroAll> getMetroAlls(Integer page) {
		return metroAllDao.getMetroAllSome(page, MetroAllService.LIMIT);
	}

	@Override
	@Transactional(readOnly=false)
	public void deleteMetroAll(int id, String region, String line) {
		metroAllDao.deleteMetroAll(id);
	}

	@Override
	@Transactional(readOnly=false)
	public MetroAll putMetroAll(MetroAll metroAll) {
		MetroAll savema=metroAllDao.putMetroAll(metroAll);
		return savema;
	}

	@Override
	public int getMetroAllSize() {
		return metroAllDao.getMetroAllSize();
	}

}
