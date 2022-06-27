package passionjava011;

public class Question04 {
	int item;
	int sell;
	int sale;
	int num;
	int total;
	int cost1;
	int cost2;
	int cost3;
	int cost4;
	int n1;
	int n2;
	int n3;
	int n4;
	int n5;
	
	public void setItem(int n) {
		this.item=n1;
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
	
	public int sell(int n) {
		this.sell=n2;
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
	public int sale(int n) {
		this.sale=n3;
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
	public int num(int n) {
		this.num=n4;
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
		int total=n5;
		n5=n2*n4-n3;
		System.out.println(item+": "+n2+"*"+n4+"-"+n3+"="+n5+'\n');
		return n5;
	}
	public static void main(String[] args) {
		System.out.println("율하마트 영수증"+'\n');
		Question04 receipt1=new Question04();
		Question04 receipt2=new Question04();
		Question04 receipt3=new Question04();
		Question04 receipt4=new Question04();
		Question04 receipt5=new Question04();
		
		receipt1.setItem(2);
		receipt1.sell(1);
		receipt1.sale(4);
		receipt1.num(6);
		receipt1.total();
		
		receipt2.setItem(4);
		receipt2.sell(4);
		receipt2.sale(5);
		receipt2.num(2);
		receipt2.total();
		
		receipt3.setItem(3);
		receipt3.sell(6);
		receipt3.sale(4);
		receipt3.num(3);
		receipt3.total();
		
		receipt4.setItem(5);
		receipt4.sell(2);
		receipt4.sale(1);
		receipt4.num(4);
		receipt4.total();
		
		receipt5.setItem(1);
		receipt5.sell(3);
		receipt5.sale(2);
		receipt5.num(6);
		receipt5.total();
		
	}
}
