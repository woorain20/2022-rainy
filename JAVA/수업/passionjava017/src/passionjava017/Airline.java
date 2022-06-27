package passionjava017;

public class Airline {
	private String company;
	private String departure;
	private String departTime;
	private String arrive;
	private String arriveTime;
	private String flyingTime;
	
	public Airline(String co, String dp, String dt, String ar, String at, String fl) {
		this.company = co;
		this.departure = dp;
		this.departTime = dt;
		this.arrive = ar;
		this.arriveTime = at;
		this.flyingTime = fl;
	}
	
	public void showInfo() {
		System.out.println("\t"+"\t"+"TICKET");
		System.out.print("항공사: "+company);
		System.out.println("\t"+"\t"+"비행시간: "+flyingTime+"\n");
		System.out.print("출발지: "+departure+"\t"+"\t");
		System.out.println("도착지: "+arrive+"\n");
		System.out.print("출발시간: "+departTime+"\t"+"\t");
		System.out.println("도착시간: "+arriveTime+"\n");
	}

}
