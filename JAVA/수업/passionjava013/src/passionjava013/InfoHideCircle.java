package passionjava013;

public class InfoHideCircle {
	public static void main(String[] args) {
		Circle c=new Circle(1.5);
		System.out.println("������: "+c.getRad());
		System.out.println("����: "+c.getArea()+"\n");
		
		c.setRad(3.4);
		System.out.println("������: "+c.getRad());
		System.out.println("����: "+c.getArea());
	}

}
