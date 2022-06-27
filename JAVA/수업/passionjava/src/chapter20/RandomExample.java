package chapter20;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		Random ran=new Random();
		System.out.println(ran.nextInt(10)+1); 	//10미만, 10도 포함하고 싶으면 +1 추가.
		
		Random ran2=new Random(12);
		for(int i=0;i<8;i++) {
			System.out.println(ran2.nextInt(10)+1);
		}
		
	}

}
