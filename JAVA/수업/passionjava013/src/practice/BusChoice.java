package practice;

public class BusChoice {
	public static void main(String[] args) {
		
		int n=5;
		
		System.out.println("������ ��������\n");
		
		switch(n) {
		case 1:
			BusFrame fr=new BusFrame();
			fr.take();
			break;
		case 2:
			BusFrame fr2=new BusFrame();
			fr2.take2();
			break;
		case 3:
			BusFrame fr3=new BusFrame();
			fr3.take3();
			break;
		case 4:
			BusFrame fr4=new BusFrame();
			fr4.take4();
			break;
		case 5:
			BusFrame fr5=new BusFrame();
			fr5.take5();
			break;
		default:
			System.out.println("�������� �ʴ� ���� �����Դϴ�.");
			break;
			}
		System.out.println("\n���� �Ϸ� �Ǽ���");	
		}
	}


