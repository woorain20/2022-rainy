package practice;

public class Theater {
	
	public void Info() {
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
		
	}
	

}
