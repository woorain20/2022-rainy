package passionjava020;

import java.util.Random;
import java.util.Scanner;

public class Quest201 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("입력1: ");
		int a=sc.nextInt();
		System.out.println("입력2: ");
		int z=sc.nextInt();
		
		int min, max;
		if(a>z) {
			min=z;
			max=a;
		}else {
			min=a;
			max=z;
		}
		
		Random ran=new Random();
		//랜덤으로 나온 수에 + 최소값
		//5 15, 15-5=10+1
		int rn;
		int[] iAr=new int[10];
		for(int i=0;i<10;i++) {
			rn=min;
			rn+=ran.nextInt(max-min+1);
			iAr[i]=rn;
		}
		System.out.println("Before sort");
		for(int i=0;i<iAr.length;i++) {
			System.out.print(iAr[i]+" ");
		}
		//정렬-선택정렬
		int temp;
		for(int i=0;i<iAr.length;i++) {
			for(int j=0;j<iAr.length;j++) {
				if(iAr[i]<iAr[j]) {
					temp=iAr[i];
					iAr[i]=iAr[j];
					iAr[j]=temp;
				}
			}
		}
		System.out.println("");
		System.out.println("sorted");
		for(int i=0;i<iAr.length;i++) {
			System.out.print(iAr[i]+" ");
		
	}
	}
}
