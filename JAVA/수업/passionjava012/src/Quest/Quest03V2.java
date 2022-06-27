package Quest;

public class Quest03V2 {
	int item;
	int price;
	int num;
	int sale;
	int total;
	
	public int item(int item) {
		this.item=item;
		switch(item) {
		case 1:
			System.out.print("맥주"+"\t");
			System.out.print(2700+"\t");
			this.item=2700;
			break;
		case 2:
			System.out.print("딸기"+"\t");
			System.out.print(7200+"\t");
			this.item=7200;
			break;
		case 3:
			System.out.print("우유"+"\t");
			System.out.print(2390+"\t");
			this.item=2390;
			break;
		case 4:
			System.out.print("라면"+"\t");
			System.out.print(3980+"\t");
			this.item=3980;
			break;
		case 5:
			System.out.print("휴지"+"\t");
			System.out.print(6800+"\t");
			this.item=6800;
			break;
		case 6:
			System.out.print("침구세트"+"\t");
			System.out.print(49900+"\t");
			this.item=49900;
			break;
		default:
			System.out.print("생수"+"\t");
			System.out.print(1600+"\t");
			this.item=1600;
			break;
		}
		return item;
	}
	public int num(int num) {
		this.num=num;
		switch(num) {
		case 1:
			System.out.print(1+"\t");
			this.num=1;
			break;
		case 2:
			System.out.print(2+"\t");
			this.num=2;
			break;
		case 3:
			System.out.print(3+"\t");
			this.num=3;
			break;
		case 4:
			System.out.print(4+"\t");
			this.num=4;
			break;
		case 5:
			System.out.print(5+"\t");
			this.num=5;
			break;
		case 6:
			System.out.print(6+"\t");
			this.num=6;
			break;
		case 7:
			System.out.print(7+"\t");
			this.num=7;
			break;
		case 8:
			System.out.print(8+"\t");
			this.num=8;
			break;
		case 9:
			System.out.print(10+"\t");
			this.num=10;
			break;
		case 10:
			System.out.print(20+"\t");
			this.num=20;
			break;
		default:
			System.out.print(30+"\t");
			this.num=30;
			break;
		}
		return num;
	}
	public int sale(int sale) {
		this.sale=sale;
		switch(sale) {
		case 1:
			if(item==2700) {
				if(num%4==0) {
					System.out.print(1000+"\t");
					this.sale=1000;
				}else {
					System.out.print(0+"\t");
					this.sale=0;
				}
				break;
			}
			if(item==7200) {
				if(num==2) {
					System.out.print(720+"\t");
					this.sale=720;
				}else {
					System.out.print(0+"\t");
					this.sale=0;
				}
				break;
			}
			if(item==2390) {
				if(num%3==0) {
					System.out.print(2390+"\t");
					this.sale=2390;
				}else {
					System.out.print(0+"\t");
					this.sale=0;
				}
				break;
			}
			if(item==1600) {
				if(num==10) {
					System.out.print(1600+"\t");
					this.sale=1600;
				}else {
					System.out.print(0+"\t");
					this.sale=0;
				}
				break;
			}
			if(item==49900) {
				System.out.print(3000+"\t");
				this.sale=3000;
				break;
			}else {
				System.out.print(0+"\t");
				break;
			}
		}
		return sale;
		}

	public int total() {
		total=item*num-sale;
		System.out.println(total+"\n");
		return total;
	}
	public static void main(String[] args) {
		System.out.println("\t"+" 율하롯데마트 영수증"+"\n");
		System.out.println("품목 \t 단가 \t 수량 \t 할인 \t 금액");
		System.out.println("---------------------------------------");
		Quest03V2 receipt1=new Quest03V2();		
		Quest03V2 receipt2=new Quest03V2();
		Quest03V2 receipt3=new Quest03V2();
		Quest03V2 receipt4=new Quest03V2();
		Quest03V2 receipt5=new Quest03V2();
		Quest03V2 receipt6=new Quest03V2();
		
		receipt1.item(2);
		receipt1.num(5);
		receipt1.sale(1);
		receipt1.total();
		
		receipt2.item(4);
		receipt2.num(2);
		receipt2.sale(1);
		receipt2.total();
		
		receipt3.item(3);
		receipt3.num(3);
		receipt3.sale(1);
		receipt3.total();
		
		receipt4.item(5);
		receipt4.num(6);
		receipt4.sale(1);
		receipt4.total();
		
		receipt5.item(1);
		receipt5.num(4);
		receipt5.sale(1);
		receipt5.total();
		
		receipt6.item(6);
		receipt6.num(3);
		receipt6.sale(1);
		receipt6.total();
		
		int pay;
		pay=receipt1.total+receipt2.total+receipt3.total+receipt4.total+receipt5.total+receipt6.total;
		System.out.println("---------------------------------------");
		System.out.println("총 금액"+"\t"+"\t"+"\t"+pay);
		System.out.println(" ");
		System.out.println("\t"+"찾아주셔서 감사합니다");
		
	}
}
