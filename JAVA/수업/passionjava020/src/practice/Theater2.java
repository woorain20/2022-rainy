package practice;

public class Theater2 {
	
	Movie mo=new Movie();
	Place pl=new Place();
	Queata qu=new Queata();
	Price pr=new Price();
	
	public void Info() {
		mo.addMovie("신비한 동물사전");
		pl.addPlace("1관");
		qu.addQue(150);
		pr.addPrice(8000);
	}
	public void Info2(){
		mo.addMovie("반지의 제왕");
		pl.addPlace("2관");
		qu.addQue(100);
		pr.addPrice(7000);
	}
	public void Info3() {
		mo.addMovie("해리포터");
		pl.addPlace("3관");
		qu.addQue(120);
		pr.addPrice(8000);
	}
	public void Info4() {
		mo.addMovie("아이언맨");
		pl.addPlace("4관");
		qu.addQue(100);
		pr.addPrice(9000);
	}
	public void Info5() {
		mo.addMovie("어벤져스");
		pl.addPlace("5관");
		qu.addQue(150);
		pr.addPrice(12000);
				
	}

	

}
