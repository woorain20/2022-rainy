package passionjava016;

import java.util.Scanner;

public class EnhancedForInst {
	public static void main(String[] args) {
		Box2[]ar=new Box2[5];
		ar[0]=new Box2(101, "Coffee");
		ar[1]=new Box2(202, "Computer");
		ar[2]=new Box2(303, "Apple");
		ar[3]=new Box2(404, "Dress");
		ar[4]=new Box2(505, "Fairy-tale book");
		
		
		//�迭���� ��ȣ�� 505�� Box�� ã�� �� ���빰�� ����ϴ� �ݺ���
		for(Box2 e: ar) {
			if(e.getBoxNum()==505) {
				System.out.println(e);
				break;
			}else if(e.getBoxNum()==101) {
				System.out.println(e);
			}else if(e.getBoxNum()==202) {
				System.out.println(e);
			}else if(e.getBoxNum()==303) {
				System.out.println(e);
			}else if(e.getBoxNum()==404) {
				System.out.println(e);
			}
		}
		
	}

}
