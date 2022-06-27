package passionjava010;

public class LocalVariable04 {
	public static void main(String[] args) {
		pay(320,"상");
		pay(220,"중");
		pay(380,"상");
		pay(120,"하");
		pay(160,"하");
		pay(250,"중");
		pay(80,"하");
		pay(400,"상");
		pay(270,"중");
		pay(180,"하");
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
		System.out.println("지원금: "+supportFund);
		System.out.println("최종 소득: "+(fund+supportFund)+'\n');
	}

}
