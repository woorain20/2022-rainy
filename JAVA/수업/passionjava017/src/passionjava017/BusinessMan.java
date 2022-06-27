package passionjava017;

public class BusinessMan extends Man{
	private String Company;
	private String Position;
	
	public BusinessMan(String name, String company, String position) {
		super(name);
		this.Company = company;
		this.Position = position;
	}
	
	public void tellYourInfo() {
		tellYourName();
		System.out.println("My Company is "+Company);
		System.out.println("My Position is "+Position);
	}
	
	

}
