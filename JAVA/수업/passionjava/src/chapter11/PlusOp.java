package chapter11;

public class PlusOp {
	
	//메소드 오버로딩
	//- 메소드의 이름이 같지만 매개변수의 타입과 갯수로 구분 가능해서 메소드의 이름을 같게 한다
	//1. 매개변수의 데이터 타입 2. 매개변수 갯수
	public void plusOp(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void plusOp(int n1, int n2, int n3) {
		System.out.println(n1+n2);
	}
	
	public void plusOp(double n1, double n2) {
		System.out.println(n1+n2);
	}
	
	public static void main(String[] args) {
		PlusOp plusOp=new PlusOp();
		plusOp.plusOp(1, 1);
		plusOp.plusOp(1, 1.1);
		plusOp.plusOp(1, 1, 3);
	}

}
