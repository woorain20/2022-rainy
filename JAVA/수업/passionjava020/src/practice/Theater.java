package practice;

public class Theater {
	
	public void Info() {
		Movie mo=new Movie();
		Place pl=new Place();
		Queata qu=new Queata();
		Price pr=new Price();
		
		mo.addMovie("신비한 동물사전");
		mo.addMovie("반지의 제왕");
		mo.addMovie("해리포터");
		mo.addMovie("아이언맨");
		mo.addMovie("어벤져스");
		
		pl.addPlace("1관");
		pl.addPlace("2관");
		pl.addPlace("3관");
		pl.addPlace("4관");
		pl.addPlace("5관");
		
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
