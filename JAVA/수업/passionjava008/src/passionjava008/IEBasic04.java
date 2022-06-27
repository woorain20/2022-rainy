package passionjava008;

public class IEBasic04 {
	public static void main(String[] args) {
		int n1=22;
		int n2=15;
		int n3=7;
		int n4=n1-n3;
		int n5=n2+n3;
		int n6=n1+n3;
		
		if(n1>n2) {
			System.out.println("n1>n2 is true");
		}
		if(n4==n5) {
			System.out.println("n4==n5 is true");
		}
		if(n6>n1+n3) {
			System.out.println("n6>n1+n3 is true");
		}
		else {
			System.out.println("n6>n1+n3 is false");
		}
		if(n6>n1+n2+n3) {
			System.out.println("n6>n1+n2+n3 is true");
		}
		if(n2==n4) {
			System.out.println("n2==n4 is true");
		}
	}

}
