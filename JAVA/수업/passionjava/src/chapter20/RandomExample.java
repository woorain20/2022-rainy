package chapter20;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		Random ran=new Random();
		System.out.println(ran.nextInt(10)+1); 	//10�̸�, 10�� �����ϰ� ������ +1 �߰�.
		
		Random ran2=new Random(12);
		for(int i=0;i<8;i++) {
			System.out.println(ran2.nextInt(10)+1);
		}
		
	}

}
