package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.SeoulMetroDao;
import com.example.demo.dto.SeoulMetro;
import com.example.demo.service.SeoulMetroService;

@Service
public class SeoulMetroServiceImpl implements SeoulMetroService {

	@Autowired
	SeoulMetroDao seoulMetroDao;
	
	@Override
	public List<SeoulMetro> getSeoulMetros(Integer page) {
		return seoulMetroDao.getSeoulMetroSome(page, SeoulMetroService.LIMIT);
	}

	@Override
	@Transactional(readOnly=false)
	public void deleteSeoulMetro(int id, String line, String startStaion, String lastStaion, int stationNum) {
		seoulMetroDao.deleteSeoulMetro(id);
	}

	@Override
	@Transactional(readOnly=false)
	public SeoulMetro putSeoulMetro(SeoulMetro seoulMetro) {
		SeoulMetro savesm=seoulMetroDao.putSeoulMetro(seoulMetro);
		return savesm;
	}

	@Override
	public int getSeoulMetroSize() {
		return seoulMetroDao.getSeoulMetroSize();
	}

}
