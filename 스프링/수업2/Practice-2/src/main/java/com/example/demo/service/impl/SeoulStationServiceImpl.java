package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.SeoulStationDao;
import com.example.demo.dto.SeoulStation;
import com.example.demo.service.SeoulStationService;

@Service
public class SeoulStationServiceImpl implements SeoulStationService {

	@Autowired
	SeoulStationDao seoulStationDao;
	
	@Override
	public List<SeoulStation> getSeoulStation(Integer page) {
		return seoulStationDao.getSeoulStationSome(page, SeoulStationService.LIMIT);
	}

	@Override
	@Transactional(readOnly=false)
	public void deleteSeoulStation(int id, String station, String line, String crossLine, String adjacency) {
		seoulStationDao.deleteSeoulStation(id);
	}

	@Override
	@Transactional(readOnly=false)
	public SeoulStation putSeoulStation(SeoulStation seoulStation) {
		SeoulStation savess=seoulStationDao.putSeoulStation(seoulStation);
		return savess;
	}

	@Override
	public int getSeoulStationSize() {
		return seoulStationDao.getSeoulStationSize();
	}

}
