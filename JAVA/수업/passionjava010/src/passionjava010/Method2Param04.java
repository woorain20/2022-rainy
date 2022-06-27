package passionjava010;

public class Method2Param04 {
	public static void main(String[] args) {
		System.out.println("투자 정보를 알려드립니다.");
		String myStoc="카카오";
		int myMonth=18;
		double myCapital=12;
		double myProfit=38.8;
		stockChannel("삼성전자",21,21.5,33);
		stockChannel("네이버",12,11.3,15.7);
		stockChannel("기아",28,10,39.5);
		stockChannel("애플",32,7.8,48.8);
		stockChannel("코카콜라",myMonth,34,31);
		stockChannel(myStoc,11,6,myProfit);
		stockChannel(myStoc,8,myCapital,27.1);
		stockChannel(myStoc,10,8,myProfit);
		stockChannel("Sk에너지",myMonth,myCapital,57.5);
		stockChannel(myStoc,myMonth,myCapital,myProfit);
		goodBye();
	}
	public static void stockChannel(String stoc, int month, double capital, double profit) {
		System.out.println("당신이 투자한 종목은 "+stoc+"입니다.");
		System.out.println("당신의 투자기간은 "+month+"개월 입니다.");
		System.out.println("당신의 투자원금은 "+capital+"$ 입니다.");
		System.out.println("당신의 수익은 "+profit+"$ 입니다.");
	}
	public static void goodBye() {
		System.out.println("투자 내용으로 볼 때 당신은...."+'\n'+"감사합니다.");
	}
}
