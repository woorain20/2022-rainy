package chapter14;

public class Man {
	//상속은 일반적으로 클래스를 나누어 사용
	
	private String name;
//	private String company;
//	private String position;
	
	
	// 메소드 오버로딩으로 오류 발생하지 않음(매개변수가 달라 사용가능)
	public Man() {
//		super();	// super(); 생략 가능
	}
	
	public Man(String name) {
		//자바의 모든 클래스는 object 클래스를 상속하고 있다.
		super();
		this.name = name;
	
	}
	public void tellYourName() {
		System.out.println("My name is "+name);
	}

}
