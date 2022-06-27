package passionjava008;

public class SwitchBreak04 {
	public static void main(String[] args) {
		System.out.println("Welcom to World"+'\n');
		int n = 2;
		switch(n) {
		case 1:
			System.out.println("Enter");
			break;
		case 2:
			System.out.println("introduction");
			break;
		case 3:
			System.out.println("About us");
			break;
		case 4:
			System.out.println("Option");
			break;
		case 5:
			System.out.println("Help");
			break;
		default:
			System.out.println("Exit");
		}
		if(n==1) {
			System.out.println('\n'+"Start");
		}else if(n==2) {
			System.out.println('\n'+"This Program is....");
		}else if(n==3) {
			System.out.println('\n'+"Programmer"+'\n'+"Tom"+'\n'+"Jack");
		}else if(n==4) {
			System.out.println('\n'+"Sound"+'\n'+"Display"+'\n'+"Alarm");
		}else if(n==5) {
			System.out.println('\n'+"If you....");
		}else {
			System.out.println('\n'+"Good bye");
		}
	}

}
