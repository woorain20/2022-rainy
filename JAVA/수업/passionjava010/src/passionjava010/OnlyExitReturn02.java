package passionjava010;

public class OnlyExitReturn02 {
	public static void main(String[] args) {
		divide(32,4);
		divide(69,3);
		divide(135,33);
		divide(32,0);
		other(34,4);
		other(54,12);
		other(34,0);
	}
	public static void divide(int num1,int num2) {
		if(num2==0) {
			System.out.println("Error");
			return;
		}
		
		System.out.println("Result: "+num1/num2);
	}
	public static void other(int num1, int num2) {
		if(num2==0)	{
			System.out.println("Error2");
			return;
		}
		System.out.println("Result: "+num1/num2);
	}
}
