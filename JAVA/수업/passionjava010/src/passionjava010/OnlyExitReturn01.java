package passionjava010;

public class OnlyExitReturn01 {
	public static void main(String[] args) {
		divide(6,2);
		divide(12,3);
		divide(133,0);
	}
	public static void divide(int num1,int num2) {
		if(num2==0	) {
			System.out.println("Error");
			return;
		}
		System.out.println("result="+(num1/num2));
	}
}
