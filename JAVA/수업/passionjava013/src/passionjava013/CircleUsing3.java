package passionjava013;

public class CircleUsing3 {
	public static void main(String[] args) {
		com.wxfx.smart.Circle3 c1=new com.wxfx.smart.Circle3(11.9);
		System.out.println("반지름 11.9 넓이: "+c1.getArea());
		
		com.fxmx.simple.Circle3 c2=new com.fxmx.simple.Circle3(18.4);
		System.out.println("반지름 18.4 둘레: "+c2.getPerimeter());
	}
}
