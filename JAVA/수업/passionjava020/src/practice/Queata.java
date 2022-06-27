package practice;

import java.util.ArrayList;
import java.util.List;

public class Queata {
	List<Integer> que=new ArrayList<>();

	
	public List<Integer> getQue() {
		return que;
	}


	public void setQue(List<Integer> que) {
		this.que = que;
	}

	public void addQue(int num) {
		que.add(num);
	}

}
