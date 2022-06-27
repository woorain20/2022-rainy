package passionjava008;

public class SwitchBreak05 {
	public static void main(String[] args) {
		int n=3;
		switch(n) {
		case 1:
			System.out.println("Hello"+'\n');
			break;
		case 2:
			System.out.println("Start"+'\n');
			break;
		case 3:
			System.out.println("Game"+'\n');
			break;
		case 4:
			System.out.println("Stop"+'\n');
			break;
		case 5:
			System.out.println("Option"+'\n');
			break;
		default:
			System.out.println("Exit"+'\n');
		}
		if(n==1) {
			System.out.println("Introduce"+'\n'+"About us"+'\n'+"Contact us");
		}else if(n>=2 && n<5) {
			System.out.println("Character"+'\n'+"Map"+'\n'+"Battle"+'\n'+"finish");
		}else if(n==5) {
			System.out.println("Sound"+'\n'+"Display");
		}else {
			System.out.println("Good bye");
		}
	}

}
