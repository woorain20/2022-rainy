package chapter5;

public class SwitchBasic {

	public static void main(String[] args) {
		int n=2;	
		//break�� �߰�ȣ�� �����
		switch(n) {
		case 1:
			System.out.println("Simple Java");
			break;
		case 2:
			System.out.println("Funny Java");
			break;
		case 3:
			System.out.println("Fantastic Java");
			break;
		default:
			System.out.println("The Best");
			}
		System.out.println("Like Java");

	}

}
