package chapter34;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
	int count=0;
	ReentrantLock reen=new ReentrantLock();
	
	public void increment() {
		reen.lock();
		count++;
		reen.unlock();
	}
	
	public void decrement() {
		reen.lock();
		count--;
		reen.unlock();
	}
	
	public int getCount() {
		return count;
	}

}
