package passionjava019;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quest201 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("임의 정수 A: ");
		int A=sc.nextInt();
		System.out.println("임의 정수 Z: ");
		int Z=sc.nextInt();
		
		int min;
		int max;
		
		if(A>Z) {
			min=Z;
			max=A;
		}else {
			min=A;
			max=Z;
		}
		
		Random ran=new Random();
		int ar[]=new int[10];
		
		for(int i=0;i<ar.length;i++) {
			ar[i]=ran.nextInt();
			if(i>=1) {
				for(int j=0;j<i;j++) {
					if(ar[i]==ar[j]) {
						ar[i]=ran.nextInt();
						j=-1;
					}
				}
			}
		}	
		Arrays.sort(ar);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		System.out.println(ar[5]);
		System.out.println(ar[6]);
		System.out.println(ar[7]);
		System.out.println(ar[8]);
		System.out.println(ar[9]);
		

	}

}
