package passionjava010;

public class LocalVariable04 {
	public static void main(String[] args) {
		pay(320,"��");
		pay(220,"��");
		pay(380,"��");
		pay(120,"��");
		pay(160,"��");
		pay(250,"��");
		pay(80,"��");
		pay(400,"��");
		pay(270,"��");
		pay(180,"��");
	}
	public static void pay(int fund,String num) {
		int supportFund=0;
		if(fund>300) {
			supportFund=0;
		}else if(fund>200) {
			supportFund=30;
		}else if(fund>150) {
			supportFund=50;
		}else if(fund>100) {
			supportFund=75;
		}else {
			supportFund=100;
		}
		System.out.println("������: "+supportFund);
		System.out.println("���� �ҵ�: "+(fund+supportFund)+'\n');
	}

}
