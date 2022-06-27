package passionjava013;

import com.wxfx.smart.Circle3;

public class ImportCircle3 {
	public static void main(String[] args) {
		Circle3 c1=new Circle3(20);
		System.out.println("반지름 20 넓이: "+c1.getArea());
		Circle3 c2=new Circle3(33.2);
		System.out.println("반지름 33.2 넓이: "+c2.getArea());
		Circle3 c3=new Circle3(13.6);
		System.out.println("반지름 13.6 넓이: "+c3.getArea());
	}

}
