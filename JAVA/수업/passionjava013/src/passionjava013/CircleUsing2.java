package passionjava013;

import com.wxfx.smart.Circle2;

public class CircleUsing2 {
	public static void main(String[] args) {
		com.wxfx.smart.Circle2 c1=new com.wxfx.smart.Circle2(7.3);
		System.out.println("원의 넓이: "+c1.getArea());
		
		com.fxmx.simple.Circle2 c2=new com.fxmx.simple.Circle2(10.5);
		System.out.println("원의 둘레: "+c2.getPerimeter());
	}

}
