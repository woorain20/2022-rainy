package passionjava017;

public class SuperSubStatic {
	public static void main(String[] args) {
		SuperCLS3 obj1=new SuperCLS3(); 	//count 값이 1 증가
		SuperCLS3 obj2=new SuperCLS3();		//count 값이 1 증가
		
		//아래 인스턴스 생성 과정에서 SuperCLS3 생성자 호출되므로,
		SubCLS3 obj3=new SubCLS3();		//count 값이 1 증가
		SubCLS3 obj4=new SubCLS3();		//count 값이 1 증가
		obj4.showCount();
	}
}
