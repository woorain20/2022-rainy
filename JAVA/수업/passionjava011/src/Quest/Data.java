package Quest;

public class Data {
	int DataAmount= 100;
	
	
	public int use(int amount) {
		DataAmount-=amount;
		return DataAmount;	
		
	}
	public int get(int amount) {
		DataAmount+=amount;
		return DataAmount;
	}
	public int nowData() {
		System.out.println("���� ��밡���� ������ �� : " + DataAmount + "gb");
		return DataAmount;
	}
	public void bye() {
		System.out.println("�����ʹ� �ſ� 1�Ͽ� �ʱ�ȭ �˴ϴ�.");
	}
		
	
	public static void main(String[] args) {
		Data keum= new Data();
		Data kim=new Data();
		keum.use(70);
		kim.get(50);
		keum.nowData();
		keum.bye();
		kim.nowData();
		kim.bye();
	}
}
