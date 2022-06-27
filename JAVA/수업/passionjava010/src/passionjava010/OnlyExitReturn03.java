package passionjava010;

public class OnlyExitReturn03 {
	public static void main(String[] args) {
		divide(35,7);
		divide(456,23);
		divide(231,0);
		other(132,54);
		other(5433,343);
		subtra(542,132);
		subtra(238,112);
		subtra(873,1225);
		square(33,34);
		square(23,76);
		square(43,13);
	}
	public static void divide(int num1, int num2) {
		if(num2==0) {
			System.out.println("Error1");
			return;
		}
		System.out.println("Result1: "+num1/num2);
	}
	public static void other(int num1, int num2) {
		if(num2==0) {
			System.out.println("Error2");
			return;
		}
		System.out.println("Result2: "+num1%num2);
	}
	public static void subtra(int num1, int num2) {
		if(num1-num2<0) {
			System.out.println("Error3");
			return;
		}
		System.out.println("Result3: "+(num1-num2));
	}
	public static void square(int num1, int num2) {
		if(num1*num2>1000) {
			System.out.println("So big");
			return;
		}
		System.out.println("Result4: "+num1*num2);
	}
}
