package Quest;

public class Quest03V1 {
	int item;
	int price;
	int num;
	int sale;
	int total;
	
	public void setItem(int item) {
		this.item=item;
		switch(item) {
		case 1:
			System.out.print("맥주"+"\t");
			break;
		case 2:
			System.out.print("딸기"+"\t");
			break;
		case 3:
			System.out.print("우유"+"\t");
			break;
		case 4:
			System.out.print("라면"+"\t");
			break;
		case 5:
			System.out.print("휴지"+"\t");
			break;
		case 6:
			System.out.print("침구세트"+"\t");
			break;
		default:
			System.out.print("생수"+"\t");
			break;
		}
	}
	public int price(int price) {
		this.price=price;
		switch(price) {
		case 1:
			System.out.print(2500+"\t");
			this.price=2500;
			break;
		case 2:
			System.out.print(6990+"\t");
			this.price=6990;
			break;
		case 3:
			System.out.print(1200+"\t");
			this.price=1200;
			break;
		case 4:
			System.out.print(9900+"\t");
			this.price=9900;
			break;
		case 5:
			System.out.print(3990+"\t");
			this.price=3990;
			break;
		case 6:
			System.out.print(49900+"\t");
			this.price=49900;
			break;
		default:
			System.out.print(7110+"\t");
			this.price=7110;
			break;
		}
		return price;
	}
	public int num(int num) {
		this.num=num;
		switch(num) {
		case 1:
			System.out.print(5+"\t");
			this.num=5;
			break;
		case 2:
			System.out.print(3+"\t");
			this.num=3;
			break;
		case 3:
			System.out.print(4+"\t");
			this.num=4;
			break;
		case 4:
			System.out.print(10+"\t");
			this.num=10;
			break;
		case 5:
			System.out.print(12+"\t");
			this.num=12;
			break;
		case 6:
			System.out.print(1+"\t");
			this.num=1;
			break;
		default:
			System.out.print(2+"\t");
			this.num=2;
			break;
		}
		return num;
	}
	public int sale(int sale) {
		this.sale=sale;
		switch(sale) {
		case 1:
			System.out.print(510+"\t");
			this.sale=510;
			break;
		case 2:
			System.out.print(680+"\t");
			this.sale=680;
			break;
		case 3:
			System.out.print(1000+"\t");
			this.sale=1000;
			break;
		case 4:
			System.out.print(800+"\t");
			this.sale=800;
			break;
		case 5:
			System.out.print(1250+"\t");
			this.sale=1250;
			break;
		case 6:
			System.out.print(3000+"\t");
			this.sale=3000;
			break;
		default:
			System.out.print(0+"\t");
			this.sale=0;
			break;
		}
		return sale;
	}
	public void print() {
		System.out.println(item);
	}
	public int total() {
		total=price*num-sale;
		System.out.println(total+"\n");
		return total;
	}
	public static void main(String[] args) {
		System.out.println("\t"+"율하롯데마트 영수증"+"\n");
		System.out.println("품목 \t 단가 \t 수량 \t 할인 \t 금액");
		Quest03V1 receipt1=new Quest03V1();
		Quest03V1 receipt2=new Quest03V1();
		Quest03V1 receipt3=new Quest03V1();
		Quest03V1 receipt4=new Quest03V1();
		Quest03V1 receipt5=new Quest03V1();
		Quest03V1 receipt6=new Quest03V1();
		
		receipt1.setItem(2);
		receipt1.price(1);
		receipt1.num(5);
		receipt1.sale(4);
		receipt1.total();
		
		receipt2.setItem(4);
		receipt2.price(4);
		receipt2.num(2);
		receipt2.sale(1);
		receipt2.total();
		
		receipt3.setItem(3);
		receipt3.price(6);
		receipt3.num(4);
		receipt3.sale(7);
		receipt3.total();
		
		receipt4.setItem(5);
		receipt4.price(2);
		receipt4.num(6);
		receipt4.sale(6);
		receipt4.total();
		
		receipt5.setItem(1);
		receipt5.price(3);
		receipt5.num(5);
		receipt5.sale(2);
		receipt5.total();
		
		receipt6.setItem(6);
		receipt6.price(2);
		receipt6.num(3);
		receipt6.sale(6);
		receipt6.total();
		
		int pay;
		pay=receipt1.total+receipt2.total+receipt3.total+receipt4.total+receipt5.total+receipt6.total;
		System.out.println("총 금액:"+"\t"+"\t"+"\t"+pay);
		System.out.println(" ");
		System.out.println("\t"+"찾아주셔서 감사합니다");
		
	}
}
