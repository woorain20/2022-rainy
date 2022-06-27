package passionjava008;

public class SwitchBreak03 {
	public static void main(String[] args) {
		int n = 2;
		switch(n) {
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("Enter");
			break;
		case 3:
			System.out.println("Introdcution");
			break;
		case 4:
			System.out.println("About us");
			break;
		case 5:
			System.out.println("Option");
			break;
		default:
			System.out.println("Exit");
			break;
		}
		if(n<5) {
			System.out.println('\n'+"Continue");
		}else {
			System.out.println('\n'+"Good bye");
		}
	}

}
