package passionjava008;

public class IEBasic05 {
	public static void main(String[] args) {
		int n1=12;
		int n2=54;
		int n3=n2/n1;
		int n4=n2-n1;
		int n5=n1+n2;
		int n6=n2%n1;
		
		if(n3>n6) {
			System.out.println("n3>n6 is true");
		}
		if(n1<n2) {
			System.out.println("n1<n2 is true");
		}
		if(n4<n5) {
			System.out.println("n4<n5 is true");
		}
		if(n1<n6) {
			System.out.println("n1<n6 is true");
		}else {
			System.out.println("n1<n6 is false");
		}
	}
}
