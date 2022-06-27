package passionjava01801;

import java.util.Scanner;

public class MyClass3 {
	private Scanner sc=new Scanner(System.in);
	private Scanner sc2=new Scanner(System.in);
	private User2[] us=new User2[5];
	private User2[]	us5=new User2[5];
	private int cou=0;
	
	private int readMember() throws ReadException{
		System.out.println("수강인원(종료는 0): ");
		int member=sc.nextInt();
		if(member<0) {
			throw new ReadException();
		}
		User2 us2=new User2();
		us2.setMember(member);
		us[cou++]=us2;
		return member;
		
	}
	private int readRoom() throws ReadException2{
		System.out.println("강의실(종료는 0): ");
		int room=sc2.nextInt();
		if(room<100) {
			throw new ReadException2();
		}
		User2 us3=new User2();
		us3.setRoom(room);
		us5[cou++]=us3;
		return room;
	}
	public void printerUser2() {
		for(int i=0;i<cou;i++) {
			System.out.println(us[i].toString());
		}
	}
	
	public static void main(String[] args) {
		MyClass3 mc=new MyClass3();
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
