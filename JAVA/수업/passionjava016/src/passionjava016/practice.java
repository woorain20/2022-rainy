package passionjava016;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		
		int arr[][]=new int[4][5];
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
		System.out.println("\n��ȣ�� ����ּ���");
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		
		if(num1==arr[0][1]) {
//			arr[0][1]=num1;
			System.out.println("�ް�");
		}else if(num1==arr[1][0]) {
//			arr[1][0]=num1;
			System.out.println("��ȣ�� ����");
		}else if(num1==arr[1][3]) {
//			arr[1][3]=num1;
			System.out.println("���ֿ��� ���̽�ũ��");
		}else if(num1==arr[2][4]) {
//			arr[2][2]=num1;
			System.out.println("�𳪹� ����");
		}else if(num1==arr[3][2]) {
//			arr[3][2]=num1;
			System.out.println("�ҵ���");
		}else {
			System.out.println("��! ������ȸ��...");
		}
		
//		int num1=sc.nextInt();
//		arr[0][0]=num1;
//		System.out.println("��! ���� ��ȸ��");
//		
//		int num2=sc.nextInt();
//		arr[0][1]=num2;
//		System.out.println("�ް�");
//		
//		int num3=sc.nextInt();
//		arr[0][2]=num3;
//		System.out.println("��! ���� ��ȸ��");
//		
//		int num4=sc.nextInt();
//		arr[0][3]=num4;
//		System.out.println("��! ���� ��ȸ��");
//		
//		int num5=sc.nextInt();
//		arr[1][0]=num5;
//		System.out.println("����");
//		
//		int num6=sc.nextInt();
//		arr[1][1]=num6;
//		System.out.println("��! ���� ��ȸ��");
//		
//		int num7=sc.nextInt();
//		arr[1][2]=num7;
//		System.out.println("��! ���� ��ȸ��");
//		
//		int num8=sc.nextInt();
//		arr[1][3]=num8;
//		System.out.println("�޷γ�");
//		
//		int num9=sc.nextInt();
//		arr[2][0]=num9;
//		System.out.println("��! ���� ��ȸ��");
//		
//		int num10=sc.nextInt();
//		arr[2][1]=num10;
//		System.out.println("��! ���� ��ȸ��");
//		
//		int num11=sc.nextInt();
//		arr[2][2]=num11;
//		System.out.println("�𳪹� ��");
//		
//		int num12=sc.nextInt();
//		arr[2][3]=num12;
//		System.out.println("��! ���� ��ȸ��");
		
	}

}
