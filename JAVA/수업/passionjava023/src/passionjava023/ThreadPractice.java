package passionjava023;

public class ThreadPractice {
	String Skilname;
	
	public ThreadPractice(String gs) {
		Skilname=gs;
	}
	
	public void run() {
		System.out.println("사용스킬: "+Skilname);
		for(int i=0;i<5;i++) {
			System.out.println(Skilname+" 스킬을 "+i+"초간 시전중입니다.");
		}
		System.out.println("스킬 시전 종료: "+Skilname);
	}
	
	public static void main(String[] args) {
		String[] gs=new String[] {"Q","W","E"};
		
		for(int i=0;i<gs.length;i++) {
			ThreadPractice sk=new ThreadPractice(gs[i]);
			sk.run();
		}
	}

}
