package passionjava023;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MutualAccess2 {
	public static void main(String[] args) throws InterruptedException {
		Counter cnt=new Counter();
		
		Runnable task1=()->{
			for(int i=0;i<2000;i++) {
				cnt.increment();
			};
		};
		
		Runnable task2=()->{
			for(int i=0;i<3000;i++) {
				cnt.decrement();
			}
		};
		
		ExecutorService exr=Executors.newFixedThreadPool(2);
		exr.submit(task1);
		exr.submit(task2);
		exr.shutdown();
		exr.awaitTermination(150, TimeUnit.SECONDS);
		System.out.println(cnt.getCount());
	}

}
