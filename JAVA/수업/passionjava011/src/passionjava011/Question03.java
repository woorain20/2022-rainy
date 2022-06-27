package passionjava011;

public class Question03 {
	private int item;
	int price;
	int num;
	int total;
	int n1;
	int n2;
	int n3;
	int n4;
	
	public void setItem(int n1) {
		this.item=n1;
		switch(n1) {
		case 1:
			System.out.print("맥주"+'\t');
			break;
		case 2:
			System.out.print("딸기"+'\t');
			break;
		case 3:
			System.out.print("우유"+'\t');
			break;
		case 4:
			System.out.print("라면"+'\t');
			break;
		case 5:
			System.out.print("휴지"+'\t');
			break;
		default:
			System.out.print("생수"+'\t');
			break;
		}
	}
	public int price(int n2) {
		this.price=n2;
		switch(n2) {
		case 1:
			System.out.print(2500+"\t");
			this.n2=2500;
			break;
		case 2:
			System.out.print(6990+"\t");
			this.n2=6990;
			break;
		case 3:
			System.out.print(1200+"\t");
			this.n2=1200;
			break;
		case 4:
			System.out.print(9900+"\t");
			this.n2=9900;
			break;
		case 5:
			System.out.print(3990+"\t");
			this.n2=3990;
			break;
		default:
			System.out.print(7110+"\t");
			this.n2=7110;
			break;
		}
		return n2;
	}
	public int num(int n3) {
		this.num=n3;
		switch(n3) {
		case 1:
			System.out.print(5+"\t");
			this.n3=5;
			break;
		case 2:
			System.out.print(3+"\t");
			this.n3=3;
			break;
		case 3:
			System.out.print(4+"\t");
			this.n3=4;
			break;
		case 4:
			System.out.print(10+"\t");
			this.n3=10;
			break;
		case 5:
			System.out.print(12+"\t");
			this.n3=12;
			break;
		default:
			System.out.print(2+"\t");
			this.n3=2;
			break;
		}
		return n3;
	}
	public void print() {
		System.out.println(n1);
	}
	public int total() {
		n4=n2*n3;
		total=n4;
		System.out.println(total);
		return total;
	}
	public static void main(String[] args) {
		System.out.println('\t'+"율하마트 영수증"+'\n');
		Question03 receipt1=new Question03();
		Question03 receipt2=new Question03();
		Question03 receipt3=new Question03();
		Question03 receipt4=new Question03();
		Question03 receipt5=new Question03();
		
		receipt1.setItem(2);
		receipt1.price(1);
		receipt1.num(5);
		receipt1.total();
		
		receipt2.setItem(4);
		receipt2.price(4);
		receipt2.num(2);
		receipt2.total();
		
		receipt3.setItem(3);
		receipt3.price(6);
		receipt3.num(3);
		receipt3.total();
		
		receipt4.setItem(5);
		receipt4.price(2);
		receipt4.num(4);
		receipt4.total();
		
		receipt5.setItem(1);
		receipt5.price(3);
		receipt5.num(6);
		receipt5.total();
		
	}
}
