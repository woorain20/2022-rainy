package Quest;

import java.util.Scanner;

//미완성
class Info{
	
	public void num1() {
		int count = 1;

		String iceA = "아이스 아메리카노";
		String hotA = "따뜻한 아메리카노";
		String moca = "까페 모카";
		String cafu = "카푸치노";
		String green = "그린티";
		String hotCoco = "따뜻한 코코아";
		String hotMil  = "따뜻한 우유";

		System.out.println("어서오세요. 인공지능 다방 602호 입니다.");
		System.out.println("주문하시겠어요?");
		System.out.println("      <메뉴>");
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
		
		String iceA = "아이스 아메리카노";
		String hotA = "따뜻한 아메리카노";
		String moca = "까페 모카";
		String cafu = "카푸치노";
		String green = "그린티";
		String hotCoco = "따뜻한 코코아";
		String hotMil  = "따뜻한 우유";
		String choice = "를 선택하셨습니다.";
		
		System.out.print("주문번호 : ");
		
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
				System.out.println("오늘은 스페셜 메뉴가 없내요.");  //메뉴 외 번호 입력시 반복기능 추가 필요.
				System.out.println("화면의 메뉴를 선택해 주세요.");
				break ;                                      
		}
		return menu;
	}
}

class Amount{
	int defVal = 0; 	//준비
	int manu = 0;
	Info serv = new Info();

	public int pay (int value, int value2) {	//주문 음료 가격
		
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
			
		System.out.println(defVal + "원 결제 도와드리겠습니다.");
		
	}

	public int change (int value) {		//거스름돈
		defVal -= value;
		return defVal;
	}
	public int count (int serv) {
		int ea = 0;
		System.out.print("수량을 입력해주세요 : ");
		Scanner scen = new Scanner(System.in);
		ea = scen.nextInt();
		String iceA = "아이스 아메리카노";
		String hotA = "따뜻한 아메리카노";
		String moca = "까페 모카";
		String cafu = "카푸치노";
		String green = "그린티";
		String hotCoco = "따뜻한 코코아";
		String hotMil  = "따뜻한 우유";
		String oder = " 잔을 주문하셨습니다.";
		
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
//    미완성



