package passionjava013;

public class UnsafeCircle {
	public static void main(String[] args) {
		Circle c=new Circle(1.5);
		System.out.println(c.getArea());
		
		c.setRad(2.5);
		System.out.println(c.getArea());
		c.setRad(3.5);;
		System.out.println(c.getArea());
		c.setRad(-4.5);		//���� ���� ���� ���. �׸��� ������ �Ǵ� �κ�
		System.out.println(c.getArea());
	}
}
