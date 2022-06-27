package passionjava013;

public class InfoHideCircle2 {
	public static void main(String[] args) {
		Circle2 c=new Circle2(3.3);
		System.out.println("반지름: "+c.getRad());
		System.out.println("넓이: "+c.getArea()+"\n");
		
		c.setRad(6.3);
		System.out.println("반지름: "+c.getRad());
		System.out.println("넓이: "+c.getArea()+"\n");
		c.setRad(16.8);
		System.out.println("반지름: "+c.getRad());
		System.out.println("넓이: "+c.getArea()+"\n");
		c.setRad(10.7);
		System.out.println("반지름: "+c.getRad());
		System.out.println("넓이: "+c.getArea()+"\n");
		c.setRad(-2.2);
		System.out.println("반지름: "+c.getRad());
		System.out.println("넓이: "+c.getArea()+"\n");
	}

}
