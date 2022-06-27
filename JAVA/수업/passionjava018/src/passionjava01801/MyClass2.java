package passionjava01801;

import java.util.Scanner;

public class MyClass2 {
	private Scanner sc=new Scanner(System.in);
	private User2[] us=new User2[5];
	private int cou=0;
	
	private int readRoom() throws ReadException{
		System.out.println("강의실(종료는 0): ");
		int room=sc.nextInt();
		if(room<100) {
			throw new ReadException();
		}
		User2 us2=new User2();
		us2.setRoom(room);
		us[cou++]=us2;
		return room;
	}
	public void printerUser2() {
		for(int i=0;i<cou;i++) {
			System.out.println(us[i].toString());
		}
	}
	public static void main(String[] args) {
		MyClass2 mc=new MyClass2();
		while(true) {
			int room=1;
			try {
				room=mc.readRoom();
			}catch(ReadException e) {
				System.out.println(e.getMessage());
			}
			if(room==0) {
				return;
			}
			mc.printerUser2();
		}
	}
}
