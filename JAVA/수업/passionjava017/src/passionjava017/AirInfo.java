package passionjava017;

import java.util.Scanner;

public class AirInfo {
	public static void main(String[] args) {
		Airline[]air=new Airline[6];
		int al=0;
		
		air[al++]=new Demestic("���� �װ�", "�뱸", "11�� 40��", "����", "12�� 30��", "50��");
		air[al++]=new Demestic("Ƽ���� �װ�", "����", "10�� 35��", "��õ", "11�� 35��", "60��");
		air[al++]=new International("����Ʈ ����", "��õ", "13�� 45��", "����ũǪ��Ʈ", "23�� 55��", "10�ð� 10��", "�Ͻ��׸���", "����");
		air[al++]=new International("�ɿ���", "��Ÿ", "16�� 20��", "����", "0�� 40��", "8�ð� 20��", "�ĸ�", "�̱�");
		air[al++]=new International("īŸ�� �װ�", "����", "20�� 5��", "������", "2�� 50��", "6�ð� 45��", "�õ��", "��������");
		air[al++]=new International("��Ÿ �װ�", "�ι���", "17�� 12��", "â��", "22�� 36��", "5�ð� 24��", "����", "�̰�����");
		
		for(int i=0;i<al;i++) {
			air[i].showInfo();
			System.out.println();
			System.out.println();
		}
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num==0) {
			air[0].showInfo();
		}else if(num==1) {
			air[1].showInfo();
		}else if(num==2) {
			air[2].showInfo();
		}else if(num==3) {
			air[3].showInfo();
		}else if(num==4) {
			air[4].showInfo();
		}else if(num==5) {
			air[5].showInfo();
		}
	}

}
