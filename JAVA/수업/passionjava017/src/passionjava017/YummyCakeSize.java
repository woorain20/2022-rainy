package passionjava017;

public class YummyCakeSize {
	public static void main(String[] args) {
		CheeseCake2 ca1=new CheeseCake2(5,7);
		Cake2 ca2=ca1;
		
		//ca2�� Cake2���̹Ƿ� ca2.size��  Cake2�� ��� size�� �ǹ���
		System.out.println("Bread Ounces: "+ca2.size);
		
		//ca1�� CheeseCake2���̹Ƿ� ca1.size�� CheeseCake2�� ��� size�� �ǹ���
		System.out.println("Cheese Ounces: "+ca1.size);
		System.out.println();
		
		ca1.showCakeSize();
		System.out.println();
		ca2.showCakeSize();
	}

}
