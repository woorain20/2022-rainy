package passionjava023;

import java.util.concurrent.locks.ReentrantLock;

public class Counter2 {
	int count=0;
	String item;
	ReentrantLock ren=new ReentrantLock();
	
	public void increment() {
		ren.lock();
		count++;
		ren.unlock();
	}
	
	public void decrement() {
		ren.lock();
		count--;
		ren.unlock();
	}
	public int getCount() {
		return count;
	}
	
	public Counter2(String it) {
		item=it;
	}
	
	public void print() {
		System.out.println(item+" 을 추첨합니다.");
		for(int i=0;i<10;i++) {
			System.out.println(i+" 번째 항목을 선택 합니다.");
		}
		System.out.println("선택되었습니다.");
	}

}
