package passionjava008;

public class IEIE04 {
	public static void main(String[] args) {
		int num1=15;
		int num2=24;
		int num3=num1+num2;
		if(num3<10) {
			System.out.println("10�̸�");
		}else if(num3<20) {
			System.out.println("10�̻� 20�̸�");
		}else if(num3<30) {
			System.out.println("20�̻� 30�̸�");
		}else if(num3>40) {
			System.out.println("30�̻� 40�̸�");
		}else if(num3<35) {
			System.out.println("30�̻� 35�̸�");
		}else if(num3==39) {
			System.out.println("num3: 39");
		}else {
			System.out.println("39");
		}
	}
}
