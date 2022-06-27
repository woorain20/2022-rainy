package passionjava017;

public class SmartPhone2 extends MobilePhone2{
	private String androidVer;
	
	public SmartPhone2(String num, String ver) {
		super(num);
		androidVer=ver;
	}
	public void playApp() {
		System.out.println("App is running in "+androidVer);
	}
}
