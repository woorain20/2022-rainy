package passionjava013;

public class UnsafeCircle3 {
	public static void main(String[] args) {
		Circle3 ci=new Circle3(7.5);
		System.out.println(ci.getArea());
		
		ci.setRad(11);
		System.out.println(ci.getArea());
		ci.setRad(12.2);
		System.out.println(ci.getArea());
		ci.setRad(7.1);
		System.out.println(ci.getArea());
	}

}
