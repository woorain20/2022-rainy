package Quest;

import java.util.Scanner;

//�̿ϼ�
class Info{
	
	public void num1() {
		int count = 1;

		String iceA = "���̽� �Ƹ޸�ī��";
		String hotA = "������ �Ƹ޸�ī��";
		String moca = "���� ��ī";
		String cafu = "īǪġ��";
		String green = "�׸�Ƽ";
		String hotCoco = "������ ���ھ�";
		String hotMil  = "������ ����";

		System.out.println("�������. �ΰ����� �ٹ� 602ȣ �Դϴ�.");
		System.out.println("�ֹ��Ͻðھ��?");
		System.out.println("      <�޴�>");
		System.out.println(count + ". " + iceA + "	3.0 ");
		System.out.println(++count + ". " + hotA + "	3.5 ");
		System.out.println(++count + ". " + moca + "		4.5 ");
		System.out.println(++count + ". " + cafu + "		4.5 ");
		System.out.println(++count + ". " + green + "		5.0 ");
		System.out.println(++count + ". " + hotCoco + "	5.0 ");
		System.out.println(++count + ". " + hotMil + "		3.5");
	}
	
	public int num2() { 
		int menu = 0;
		
		String iceA = "���̽� �Ƹ޸�ī��";
		String hotA = "������ �Ƹ޸�ī��";
		String moca = "���� ��ī";
		String cafu = "īǪġ��";
		String green = "�׸�Ƽ";
		String hotCoco = "������ ���ھ�";
		String hotMil  = "������ ����";
		String choice = "�� �����ϼ̽��ϴ�.";
		
		System.out.print("�ֹ���ȣ : ");
		
		Scanner scen = new Scanner(System.in);
		menu = scen.nextInt();
		
		switch (menu) {
			case 1:
				System.out.println(iceA + choice);
				break;
			case 2:
				System.out.println(hotA + choice);
				break;
			case 3:
				System.out.println(moca + choice);
				break;
			case 4:
				System.out.println(cafu + choice);
				break;
			case 5:
				System.out.println(green + choice);
				break;
			case 6:
				System.out.println(hotCoco + choice);
				break;
			case 7:
				System.out.println(hotMil + choice);
				break;
			default:
				System.out.println("������ ����� �޴��� ������.");  //�޴� �� ��ȣ �Է½� �ݺ���� �߰� �ʿ�.
				System.out.println("ȭ���� �޴��� ������ �ּ���.");
				break ;                                      
		}
		return menu;
	}
}

class Amount{
	int defVal = 0; 	//�غ�
	int manu = 0;
	Info serv = new Info();

	public int pay (int value, int value2) {	//�ֹ� ���� ����
		
		switch(value) {
			case 1:
				defVal = 3000 * value2;
				return defVal;
			case 2:
				defVal = 3500 * value2;
				return defVal;
			case 3:
				defVal = 4500 * value2;
				return defVal;
			case 4:
				defVal = 4500 * value2;
				return defVal;
			case 5:
				defVal = 5000 * value2;
				return defVal;
			case 6:
				defVal = 5000 * value2;
				return defVal;
			case 7:
				defVal = 3500 * value2;
				return defVal;
			default:
				break;
		}
			
		System.out.println(defVal + "�� ���� ���͵帮�ڽ��ϴ�.");
		
	}

	public int change (int value) {		//�Ž�����
		defVal -= value;
		return defVal;
	}
	public int count (int serv) {
		int ea = 0;
		System.out.print("������ �Է����ּ��� : ");
		Scanner scen = new Scanner(System.in);
		ea = scen.nextInt();
		String iceA = "���̽� �Ƹ޸�ī��";
		String hotA = "������ �Ƹ޸�ī��";
		String moca = "���� ��ī";
		String cafu = "īǪġ��";
		String green = "�׸�Ƽ";
		String hotCoco = "������ ���ھ�";
		String hotMil  = "������ ����";
		String oder = " ���� �ֹ��ϼ̽��ϴ�.";
		
		switch (serv) {
			case 1:
				System.out.println(iceA + "  " +  ea + oder);
				break;
			case 2:
				System.out.println(hotA + "  " + ea + oder);
				break;
			case 3:
				System.out.println(moca + "  " + ea + oder);
				break;
			case 4:
				System.out.println(cafu + "  " + ea + oder);
				break;
			case 5:
				System.out.println(green + "  " +  ea + oder);
				break;
			case 6:
				System.out.println(hotCoco + "  " + ea + oder);
				break;
			case 7:
				System.out.println(hotMil + "  " + ea + oder);
				break;
			default:
				break;
		}
		return ea;
	}
}

class Cafe {
	public static void main(String[] args) {
		int num3 = 0;
		int num4 = 0;
		Info serv = new Info();
		Amount coun = new Amount();

		serv.num1();
		num3 = serv.num2();
		num4 = coun.count(num3);
		coun.pay(num3, num4);
	}
}
//    �̿ϼ�



