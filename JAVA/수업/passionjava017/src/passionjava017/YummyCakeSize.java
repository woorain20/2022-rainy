package passionjava017;

public class YummyCakeSize {
	public static void main(String[] args) {
		CheeseCake2 ca1=new CheeseCake2(5,7);
		Cake2 ca2=ca1;
		
		//ca2는 Cake2형이므로 ca2.size는  Cake2의 멤버 size를 의미함
		System.out.println("Bread Ounces: "+ca2.size);
		
		//ca1은 CheeseCake2형이므로 ca1.size는 CheeseCake2의 멤버 size를 의미함
		System.out.println("Cheese Ounces: "+ca1.size);
		System.out.println();
		
		ca1.showCakeSize();
		System.out.println();
		ca2.showCakeSize();
	}

}
