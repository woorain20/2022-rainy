package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DaeguMetroDao;
import com.example.demo.dto.DaeguMetro;
import com.example.demo.service.DaeguMetroService;

@Service
public class DaeguMetroServiceImpl implements DaeguMetroService {

	@Autowired
	DaeguMetroDao daeguMetroDao;
	
	@Override
	public List<DaeguMetro> getDaeguMetros(Integer page) {
		return daeguMetroDao.getDaeguMetroSome(page, DaeguMetroService.LIMIT);
	}

	@Override
	@Transactional(readOnly=false)
	public void deleteDaeguMetro(int id, String line, String startStaion, String lastStaion, int stationNum) {
		daeguMetroDao.deleteDaeguMetro(id);
	}

	@Override
	@Transactional(readOnly=false)
	public DaeguMetro putDaeguMetro(DaeguMetro daeguMetro) {
		DaeguMetro savedm=daeguMetroDao.putDaeguMetro(daeguMetro);
		return savedm;
	}

	@Override
	public int getDaeguMetroSize() {
		return daeguMetroDao.getDaeguMetroSize();
	}

}
