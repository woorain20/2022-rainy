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
		System.out.println("현재 사용가능한 데이터 량 : " + DataAmount + "gb");
		return DataAmount;
	}
	public void bye() {
		System.out.println("데이터는 매월 1일에 초기화 됩니다.");
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
