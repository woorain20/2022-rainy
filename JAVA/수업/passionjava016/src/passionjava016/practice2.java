package passionjava016;

import java.util.Scanner;

public class practice2 {
	public static void main(String[] args) {
		
		int arr[][]=new int[3][4];
		int num=1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=num;
				num++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\n게임을 시작합니다");
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		Scanner sc2=new Scanner(System.in);
		int num2=sc2.nextInt();
		
		if(num1==arr[0][0]) {
			arr[0][0]=num1;
			if(num2==arr[1][2]) {
				arr[1][2]=num2;
				System.out.println("10점");
			}else {
				System.out.println("-2점");
			}
		}else if(num1==arr[0][1]) {
			arr[0][1]=num1;
			if(num2==arr[2][2]) {
				arr[2][2]=num2;
				System.out.println("10점");
			}else {
				System.out.println("-2점");
			}
		}else if(num1==arr[0][2]) {
			arr[0][2]=num1;
			if(num2==arr[1][0]) {
				arr[1][0]=num2;
				System.out.println("10점");
			}else {
				System.out.println("-2점");
			}
		}else if(num1==arr[0][3]) {
			arr[0][3]=num1;
			if(num2==arr[2][0]) {
				arr[2][0]=num2;
				System.out.println("10점");
			}else {
				System.out.println("-2점");
			}
		}else if(num1==arr[1][0]) {
			arr[1][0]=num1;
			if(num2==arr[0][2]) {
				arr[0][2]=num2;
				System.out.println("10점");
			}else {
				System.out.println("-2점");
			}
		}else if(num1==arr[1][1]) {
			arr[1][1]=num1;
			if(num2==arr[1][3]) {
				arr[1][3]=num2;
				System.out.println("10점");
			}else {
				System.out.println("-2점");
			}
		}else if(num1==arr[1][2]) {
			arr[1][2]=num1;
			if(num2==arr[0][0]) {
				arr[0][0]=num2;
				System.out.println("10점");
			}else {
				System.out.println("-2점");
			}
		}else if(num1==arr[1][3]) {
			arr[1][3]=num1;
			if(num2==arr[1][1]) {
				arr[1][1]=num2;
				System.out.println("10점");
			}else {
				System.out.println("-2점");
			}
		}else if(num1==arr[2][0]) {
			arr[2][0]=num1;
			if(num2==arr[0][3]) {
				arr[0][3]=num2;
				System.out.println("10점");
			}else {
				System.out.println("-2점");
			}
		}else if(num1==arr[2][1]) {
			arr[2][1]=num1;
			if(num2==arr[2][3]) {
				arr[2][3]=num2;
				System.out.println("10점");
			}else {
				System.out.println("-2점");
			}
		}else if(num1==arr[2][2]) {
			arr[2][2]=num1;
			if(num2==arr[0][1]) {
				arr[0][1]=num2;
				System.out.println("10점");
			}else {
				System.out.println("-2점");
			}
		}else if(num1==arr[2][3]) {
			arr[2][3]=num1;
			if(num2==arr[2][1]) {
				arr[2][1]=num2;
				System.out.println("10점");
			}else {
				System.out.println("-2점");
			}
		}
	}
}
