package Quest;

public class Quest01V1 {
	private String company;
	private String driver;
	private String num;
	private String start;
	private String stop;
	private String time;
	private String first;
	private String last;
	
	public Quest01V1(String co, String dr, String n, String sta, String op, String ti, String fi, String la) {
		company=co;
		driver=dr;
		num=n;
		start=sta;
		stop=op;
		time=ti;
		first=fi;
		last=la;
	}
	
	public void setCompany(String company) {
		this.company=company;
	}
	public void setDriver(String driver) {
		this.driver=driver;
	}
	public void setNum(String num) {
		this.num=num;
	}
	public void setStart(String start) {
		this.start=start;
	}
	public void setStop(String stop) {
		this.stop=stop;
	}
	public void setTime(String time) {
		this.time=time;
	}
	public void setFirst(String first) {
		this.first=first;
	}
	public void setLast(String last) {
		this.last=last;
	}
	public void print() {
		System.out.println("버스회사: "+company);
		System.out.println("운전사: "+driver);
		System.out.println("버스번호: "+num);
		System.out.println("출발지: "+start);
		System.out.println("종착지: "+stop);
		System.out.println("배차시간: "+time);
		System.out.println("첫차: "+first);
		System.out.println("마지막차: "+last+'\n');
	}
	public static void main(String[] args) {
		System.out.println("좋은 아침입니다.");
		System.out.println("오늘의 버스 정보"+'\n');
		
		Quest01V1 information=new Quest01V1("우진고속","박우진","724","시지","칠곡","15분","5시 40분","10시 15분");
		information.print();
		
		Quest01V1 information2=new Quest01V1("세진고속","정고속","425","경산","화원","30분","5시 50분","10시 5분");
		information2.print();
		
		Quest01V1 information3=new Quest01V1("동일운수","김동일","수성3","반야월","월배","20분","6시","10시 30분");
		information3.print();
		
		Quest01V1 information4=new Quest01V1("세진고속","이세진","급행1","상인","팔공산","30분","6시 5분","10시 10분");
		information4.print();
		
		System.out.println("좋은 하루 되세요.");
	}
}
