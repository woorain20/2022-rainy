package passionjava013;

public class UnsafeCircle2 {
	public static void main(String[] args) {
		Circle2 c=new Circle2(4);
		System.out.println(c.getArea());
		
		c.setRad(6.4);
		System.out.println(c.getArea());
		c.setRad(7.7);
		System.out.println(c.getArea());
		c.setRad(10);
		System.out.println(c.getArea());
	}

}
