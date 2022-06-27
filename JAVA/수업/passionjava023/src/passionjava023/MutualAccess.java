package passionjava023;

public class MutualAccess {
	public static void main(String[] args) throws InterruptedException {
		Counter cnt=new Counter();
		
		Runnable task1=()->{
			for(int i=0;i<2000;i++) {
				cnt.increment();
			};
		};
		
		Runnable task2=()->{
			for(int i=0;i<1500;i++) {
				cnt.decrement();
			}
		};
		
		Thread t1=new Thread(task1);
		Thread t2=new Thread(task2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(cnt.getCount());
	}

}
