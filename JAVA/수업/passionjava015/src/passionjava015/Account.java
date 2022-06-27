package passionjava015;

public class Account {
	
	private String item;
	private int pay;
	private double percent;
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
		
	@Override
	public String toString() {
		return "Account [item=" + item + ", pay=" + pay + ", percent=" + percent + "]";
	}
	public static void main(String[] args) {
		String item[]=new String [8];
		int pay[]=new int[12];
		double percent[]=new double[7];
		
		System.out.println(item.length);
		System.out.println(pay.length);
		System.out.println(percent.length);
		
		item[0]="식비";
		item[1]="통신";
		item[2]="주거";
		item[3]="기타";
		item[4]="경조사";
		item[5]="패션미용";
		item[6]="문화생활";
		item[7]="교통";
		
		pay[0]=1000;
		pay[1]=2000;
		pay[2]=3000;
		pay[3]=5000;
		pay[4]=2500;
		pay[5]=10000;
		pay[6]=7500;
		pay[7]=15000;
		pay[8]=20000;
		pay[9]=pay[5]+pay[7];
		pay[10]=pay[8]+pay[7];
		pay[11]=pay[9]+pay[10];
		
		percent[0]=12.5;
		percent[1]=30.1;
		percent[2]=16.4;
		percent[3]=18.9;
		percent[4]=10.8;
		percent[5]=7.5;
		percent[6]=24.2;
		
		System.out.println(item[1]+" "+pay[2]+" "+percent[3]);
		
		Account[] ac=new Account[10];
		Account acc=new Account();
		acc.setItem(item[4]);
		acc.setPay(pay[11]);
		acc.setPercent(percent[6]);
		ac[0]=acc;
		
		Account[] ac2=new Account[11];
		Account acc2=new Account();
		acc2.setItem(item[5]);
		acc2.setPay(pay[7]);
		acc2.setPercent(percent[3]);
		ac2[0]=acc2;
		
		System.out.println(ac[0].toString());
		System.out.println(ac2[0].toString());
		
	}
	

}
