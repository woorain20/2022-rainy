package passionjava015;

import java.util.Scanner;

public class SacnningKeyboard {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		
		int sum=num1+num2+num3+num4;
		System.out.printf("%d+%d+%d+%d=%d\n", num1, num2,num3, num4, sum);
	}

}
