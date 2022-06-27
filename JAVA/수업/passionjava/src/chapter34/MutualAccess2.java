package chapter34;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MutualAccess2 {
	public static void main(String[] args) throws InterruptedException {
		Counter cnt=new Counter();
		
		Runnable task1=()->{ 	//Runnable은 import하지 않아도 약속되어 있음
			for(int i=0;i<1000;i++) {
				cnt.increment();
			}
		};
		
		Runnable task2=()->{ 	
			for(int i=0;i<1000;i++) {
				cnt.decrement();
			}
		};
		//쓰레드 풀 사용
		ExecutorService exr=Executors.newFixedThreadPool(2);
		exr.submit(task1);
		exr.submit(task2);
		exr.shutdown();
		exr.awaitTermination(100, TimeUnit.SECONDS);
		System.out.println(cnt.getCount());
	}

}
