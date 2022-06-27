package passionjava008;

public class SwitchBasic04 {
	public static void main(String[] args) {
		int n = 6;
		switch(n) {
		case 1:
			System.out.println("Hello");
		case 2:
			System.out.println("True");
		case 3:
			System.out.println("False");
		case 4:
			System.out.println("Dynamic");
		case 5:
			System.out.println("Bye");
		default:
			System.out.println("Error");
		}
		System.out.println("Warning");
	}
}
