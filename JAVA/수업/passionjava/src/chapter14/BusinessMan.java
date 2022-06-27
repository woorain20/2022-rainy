package chapter14;

public class BusinessMan extends Man{ //extends 뒤에 상속받을 클래스를 적음으로 해당 클래스와 상속관계가 성립됨
	
	private String company;
	private String position;
	

	public BusinessMan(String name, String company, String position) {
		super(name);	//상위 클래스의 생성자 메소드를 호출, 하위 클래스의 생성자에서 가장 먼저 호출되어야 한다. 순서를 밑으로 내리면 컴파일 오류 발생, 생략도 가능
		this.company = company;
		this.position = position;
	}

	public void tellYourInfo() {
//		printCompany();
		tellYourName();
		System.out.println("My company is "+company);
		System.out.println("My position is "+position);
	}
	
	public void printCompany() {
		System.out.println("My company is "+company);
	}

}
