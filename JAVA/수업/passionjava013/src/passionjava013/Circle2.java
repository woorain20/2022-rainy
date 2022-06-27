package passionjava013;

public class Circle2 {
	private double rad=0;
	final double PI=3.14;
	
	public Circle2(double r) {
		setRad(r);
	}
	public void setRad(double r) {
		if(r<0) {
			rad=0;
			return;
		}
		rad=r;
	}
	public double getRad() {
		return rad;
	}
	public double getArea() {
		return(rad*rad)*PI;
	}
}
