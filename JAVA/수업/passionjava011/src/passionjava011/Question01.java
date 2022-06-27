package passionjava011;

public class Question01 {
	private String company;
	private String driver;
	private String num;
	private String start;
	private String stop;
	private String time;
	private String first;
	private String last;
	
	
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
		Question01 information=new Question01();
		information.setCompany("우진고속");
		information.setDriver("장삼");
		information.setNum("724");
		information.setStart("시지");
		information.setStop("칠곡");
		information.setTime("15분");
		information.setFirst("5시 40분");
		information.setLast("10시 15분");
		information.print();
		
		information.setCompany("세진고속");
		information.setDriver("이사");
		information.setNum("425");
		information.setStart("경산");
		information.setStop("화원");
		information.setTime("30분");
		information.setFirst("5시 50분");
		information.setLast("10시 5분");
		information.print();
		
		information.setCompany("동일운수");
		information.setDriver("김이박");
		information.setNum("수성3");
		information.setStart("반야월");
		information.setStop("월배");
		information.setTime("20분");
		information.setFirst("6시");
		information.setLast("10시 30분");
		information.print();
		System.out.println("좋은 하루 되세요.");
	}
}
