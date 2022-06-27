package passionjava013;

public class InfoHideCircle3 {
	public static void main(String[] args) {
		Circle3 cir=new Circle3(3.9);
		System.out.println("반지름: "+cir.getRad());
		System.out.println("넓이: "+cir.getArea()+"\n");
		
		cir.setRad(8.4);
		System.out.println("반지름: "+cir.getRad());
		System.out.println("넓이: "+cir.getArea()+"\n");
		cir.setRad(12.6);
		System.out.println("반지름: "+cir.getRad());
		System.out.println("넓이: "+cir.getArea()+"\n");
		cir.setRad(21);
		System.out.println("반지름: "+cir.getRad());
		System.out.println("넓이: "+cir.getArea()+"\n");
	}
}
