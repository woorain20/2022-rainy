package practice;

import java.util.Random;

public class Theater3 {
	
	public static void main(String[] args) {
		
		Movie mo=new Movie();
		Place pl=new Place();
		Queata qu=new Queata();
		Price pr=new Price();
		
		mo.addMovie("�ź��� ��������");
		mo.addMovie("������ ����");
		mo.addMovie("�ظ�����");
		mo.addMovie("���̾��");
		mo.addMovie("�����");
		
		pl.addPlace("1��");
		pl.addPlace("2��");
		pl.addPlace("3��");
		pl.addPlace("4��");
		pl.addPlace("5��");
		
		qu.addQue(150);
		qu.addQue(100);
		qu.addQue(120);
		qu.addQue(100);
		qu.addQue(150);
		
		pr.addPrice(8000);
		pr.addPrice(7000);
		pr.addPrice(9000);
		pr.addPrice(12000);
		pr.addPrice(8000);
		
		for(int i=0;i<mo.getMovie().size();i++) {
			System.out.println(mo.getMovie().get(i));
		}
		System.out.println();
		for(int i=0;i<pl.getPlace().size();i++) {
			System.out.println(pl.getPlace().get(i));
		}
		System.out.println();
		for(int i=0;i<qu.getQue().size();i++) {
			System.out.println(qu.getQue().get(i));
		}
		System.out.println();
		for(int i=0;i<pr.getPrice().size();i++) {
			System.out.println(pr.getPrice().get(i));
		}		
		
	}
	

}
