package Quest;

public class Animal {
	private String color;
	private String kind;
	private String point;
	
	public void setAnimal(String color) {
		this.color=color;
	}
	public void setKind(String kind) {
		this.kind=kind;
	}
	public void setPoint(String point) {
		this.point=point;
	}
	public void printAnimal() {
		System.out.println("색 깔 : "+color);
		System.out.println("종 류 : "+kind);
		System.out.println("특 징 : "+point);
	}
	public void next() {
		System.out.println("무슨 동물일까요");
	}
	public static void main(String[] args) {
		Animal prog=new Animal();
		prog.setAnimal("초록색");
		prog.setKind("양서류");
		prog.setPoint("겨울잠, 왕눈이");
		prog.printAnimal();
		prog.next();
		System.out.println("\n");
		
		Animal monkey=new Animal();
		monkey.setAnimal("검회색");
		monkey.setKind("영장류");
		monkey.setPoint("킹콩");
		monkey.printAnimal();
		monkey.next();
		
		
		
		
		
	}
}