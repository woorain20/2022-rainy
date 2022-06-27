package passionjava010;

public class LocalVariable03 {
	public static void main(String[] args) {
		pay(220,false);
		pay(150,true);
		pay(300,false);
		pay(110,true);
		pay(180,false);
		pay(270,false);
		pay(90, true);
		
	}
	public static void pay(int support,boolean target) {
		int supportFund=0;
		if(support>200) {
			supportFund=0;
		}else if(support>100){
			supportFund=40;
		}else {
			supportFund=80;
		}
		System.out.println("Áö¿ø±Ý: "+supportFund);
	}
}
