package passionjava017;

public class International extends Airline{
	private String stopover;
	private String nation;
	
	public International(String co, String dp, String dt, String ar, String at, String fl, String so, String na) {
		super(co, dp, dt, ar, at, fl);
		this.stopover=so;
		this.nation=na;
		
	}
	public void showInfo() {
		super.showInfo();
		System.out.print("������: "+stopover+"\t"+"\t");
		System.out.println("���� ����: "+nation);
	}
	
	

}
