package passionjava008;

public class SwitchBreak02 {

	public static void main(String[] args) {
		int n = 5;
		switch(n) {
		case 1:
			System.out.println("Enter");
			break;
		case 2:
			System.out.println("Introdcution");
			break;
		case 3:
			System.out.println("About us");
			break;
		case 4:
			System.out.println("Option");
			break;
		default:
			System.out.println("Exit");
		}
		if(n<=4) {
			System.out.println("Continue");
		}else {
			System.out.println("Good Bye");
		}
		

	}
}