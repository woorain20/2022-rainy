package passionjava023;

public class ThreadPractice {
	String Skilname;
	
	public ThreadPractice(String gs) {
		Skilname=gs;
	}
	
	public void run() {
		System.out.println("��뽺ų: "+Skilname);
		for(int i=0;i<5;i++) {
			System.out.println(Skilname+" ��ų�� "+i+"�ʰ� �������Դϴ�.");
		}
		System.out.println("��ų ���� ����: "+Skilname);
	}
	
	public static void main(String[] args) {
		String[] gs=new String[] {"Q","W","E"};
		
		for(int i=0;i<gs.length;i++) {
			ThreadPractice sk=new ThreadPractice(gs[i]);
			sk.run();
		}
	}

}
