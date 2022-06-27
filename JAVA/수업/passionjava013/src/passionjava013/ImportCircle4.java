package passionjava013;

import com.fxmx.simple.Circle2;

public class ImportCircle4 {
	public static void main(String[] args) {
		Circle2 circle=new Circle2(15);
		System.out.println("반지름 15 둘레: "+circle.getPerimeter());
		Circle2 circle1=new Circle2(25.4);
		System.out.println("반지름 25.4 둘레: "+circle1.getPerimeter());
		Circle2 circle2=new Circle2(31.1);
		System.out.println("반지름 31.1 둘레: "+circle2.getPerimeter());
	}

}
