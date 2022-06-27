package passionjava01801;

import java.util.Scanner;

public class MyClass {
	private Scanner sc=new Scanner(System.in);
	private User2[] us=new User2[5];
	private int cou=0;
	
	private int readMember() throws ReadException{
		System.out.println("등록인원(종료는 0): ");
		int member=sc.nextInt();
		if(member<0) {
			throw new ReadException();
		}
		User2 us2=new User2();
		us2.setMember(member);
		us[cou++]=us2;
		return member;
	}
	public void printerUser2() {
		for(int i=0;i<cou;i++) {
			System.out.println(us[i].toString());
		}
	}
	public static void main(String[] args) {
		MyClass mc=new MyClass();
		while(true) {
			int member=1;
			try {
				member=mc.readMember();
			}catch(ReadException e) {
				System.out.println(e.getMessage());
			}
			if(member==0) {
				return;
			}
			mc.printerUser2();
		}
	}
}
