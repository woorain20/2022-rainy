package passionjava017;

public class YummyCakeOf {
	public static void main(String[] args) {
		Cake3 cake=new StrawberryCheeseCake();
		
		if(cake instanceof Cake3) {
			System.out.println("���� �ν��Ͻ� or");
			System.out.println("���� ����ϴ� �ν��Ͻ� \n");
		}
		if(cake instanceof CheeseCake3) {
			System.out.println("ġ������ �ν��Ͻ� or");
			System.out.println("ġ������ ����ϴ� �ν��Ͻ� \n");
		}
		if(cake instanceof StrawberryCheeseCake) {
			System.out.println("����ġ������ �ν��Ͻ� or");
			System.out.println("����ġ������ ����ϴ� �ν��Ͻ�");
		}
	}

}
