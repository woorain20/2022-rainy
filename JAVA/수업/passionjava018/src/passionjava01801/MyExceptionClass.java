package passionjava01801;

import java.util.Scanner;

public class MyExceptionClass {
	private Scanner sc=new Scanner(System.in);
	private User[] us=new User[8];
	private int cnt=0;
	
	public int readAge() throws ReadAgeException{
		System.out.print("나이 입력(종료는 0): ");
		 int age=sc.nextInt();
		 if(age<0) {
			 throw new ReadAgeException();
		 }
		 User use=new User();
		 use.setAge(age);
		 us[cnt++]=use;
		 return age;
	}
	public void printerUsers() {
		for(int i=0;i<cnt;i++) {
			System.out.println(us[i].toString());
		}
	}
	public static void main(String[] args) {
		MyExceptionClass mec=new MyExceptionClass();
		while(true) {
			int age=1;
			try {
				age=mec.readAge();
			}catch(ReadAgeException e) {
				System.out.println(e.getMessage());
			}
			if(age==0) {
				return;
			}
			mec.printerUsers();
		}
	}
}
