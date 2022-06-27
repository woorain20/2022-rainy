package passionjava023;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {
	int count=0;
	ReentrantLock ree=new ReentrantLock();
	
	public void increment() {
		ree.lock();
		count++;
		ree.unlock();
	}
	
	public void decrement() {
		ree.lock();
		count--;
		ree.unlock();
	}
	public int getCount() {
		return count;
	}

}
