package service;

import java.util.List;

import dto.FortuneVO;

public interface FortuneService {

	List<FortuneVO> getFortuneList();

	//C->����� �Է�(������, �Ϲݻ����)
	void createFortune(int id, String name, String fortuneStr);

	//U
	void putFortune(FortuneVO fortuneVO);

	//D
	void deleteFortune(FortuneVO fortuneVO);

}