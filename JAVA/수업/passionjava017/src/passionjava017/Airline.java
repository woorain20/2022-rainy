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
		System.out.print("�װ���: "+company);
		System.out.println("\t"+"\t"+"����ð�: "+flyingTime+"\n");
		System.out.print("�����: "+departure+"\t"+"\t");
		System.out.println("������: "+arrive+"\n");
		System.out.print("��߽ð�: "+departTime+"\t"+"\t");
		System.out.println("�����ð�: "+arriveTime+"\n");
	}

}
