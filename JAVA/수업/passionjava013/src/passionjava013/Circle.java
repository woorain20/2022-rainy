package passionjava013;

public class Circle {
	private double rad=0;	//원의 반지름
	final double PI=3.14;
	
	public Circle(double r) {
		setRad(r);	//아래에 정의된 setRad 메소드 호출을 통한 초기화
	}
	public void setRad(double r) {
		if(r<0) {	//반지름은 0보다 작을 수 없으므로
			rad=0;
			return;	//이 위치에서 메소드 빠져 나감
		}
		rad=r;
	}
	public double getRad() {
		return rad;
	}
	public double getArea() {
		return(rad*rad)*PI;		//원의 넓이 반환
	}

}
