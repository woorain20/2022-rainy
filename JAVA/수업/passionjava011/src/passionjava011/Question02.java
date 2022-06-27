package passionjava011;

public class Question02 {
	private String item;
	int cost=0;
	int cost1;
	int cost2;
	int cost3;
	int cost4;
	int n=1;
	
	public void setItem(String item) {
		this.item=item;
		int n=1;
		switch(n) {
		case 1:
			System.out.println("맥주");
			break;
		case 2:
			System.out.println("딸기");
			break;
		case 3:
			System.out.println("우유");
			break;
		case 4:
			System.out.println("라면");
			break;
		case 5:
			System.out.println("휴지");
			break;
		case 6:
			System.out.println("화분");
			break;
		default:
			System.out.println("생수");
			break;
		}
	}
	
	public int sell(int amount) {
		cost+=amount;
		int n=1;
		switch(n) {
		case 1:
			System.out.println(4030);
			break;
		case 2:
			System.out.println(8950);
			break;
		case 3:
			System.out.println(1990);
			break;
		case 4:
			System.out.println(3420);
			break;
		case 5:
			System.out.println(6080);
			break;
		case 6:
			System.out.println(12800);
			break;
		default:
			System.out.println(9900);
			break;
		}
		return cost1;
	}
	public int sale(int amount) {
		cost-=amount;
		int n=1;
		switch(n) {
		case 1:
			System.out.println(500);
			break;
		case 2:
			System.out.println(1000);
			break;
		case 3:
			System.out.println(490);
			break;
		case 4:
			System.out.println(780);
			break;
		case 5:
			System.out.println(1250);
			break;
		case 6:
			System.out.println(2100);
			break;
		default:
			System.out.println(1640);
			break;
		}
		return cost2;
	}
	public int num(int amount) {
		cost+=amount;
		int n=1;
		switch(n) {
		case 1:
			System.out.println(5);
			break;
		case 2:
			System.out.println(3);
			break;
		case 3:
			System.out.println(4);
			break;
		case 4:
			System.out.println(10);
			break;
		case 5:
			System.out.println(12);
			break;
		case 6:
			System.out.println(8);
			break;
		default:
			System.out.println(2);
			break;
		}
		return cost3;
	}
	public int total() {
		int result;
		result=cost1*cost3-cost3;
		System.out.print(item+": "+result);
		return cost4;
	}
	public static void main(String[] args) {
		System.out.println("율하마트");
		Question02 receipt1=new Question02();
		Question02 receipt2=new Question02();
		Question02 receipt3=new Question02();
		
		receipt1.sell(5000);
		
	}
}
