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
		System.out.println(item+" �� ��÷�մϴ�.");
		for(int i=0;i<10;i++) {
			System.out.println(i+" ��° �׸��� ���� �մϴ�.");
		}
		System.out.println("���õǾ����ϴ�.");
	}

}
