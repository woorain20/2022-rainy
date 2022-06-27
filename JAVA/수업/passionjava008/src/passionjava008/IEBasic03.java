package passionjava008;

public class IEBasic03 {
	public static void main(String[] args) {
		int n1=3;
		int n2=41;
		int n3=n1*n2;
		int n4=n1+n2;
		int n5=n2-n1;
		
		if(n3>n4) {
			System.out.println("n3>n4 is true");
		}
		if(n5<n2) {
			System.out.println("n5<n2 is true");
		}
		if(n1+n4>n2+n5) {
			System.out.println("n1+n4>n2+n5 is true");
		}
		else {
			System.out.println("n1+n4>n2+n5 is false");
		}
	}

}
