package passionjava010;

public class LocalVariable02 {
	public static void main(String[] args) {
		pay(120,true);
		pay(180,false);
		pay(150,false);
		pay(90,true);
	}
	public static void pay(int fund,boolean target) {
		int supportFund=0;
		if(target) {
			supportFund=fund+50;
		}else {
			supportFund=0;
		}
		System.out.println("Áö¿ø±Ý: "+supportFund);
	}
}
