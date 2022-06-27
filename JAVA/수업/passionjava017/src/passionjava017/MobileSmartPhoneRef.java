package passionjava017;

public class MobileSmartPhoneRef {
	public static void main(String[] args) {
		SmartPhone ph1=new SmartPhone("010-1234-5678", "snow");
		SmartPhone ph2=new SmartPhone("010-9876-5432", "Ä«Ä«¿ÀÅå");
		
		ph1.answer();
		ph1.playApp();
		System.out.println();
		
		ph2.answer();
		ph2.playApp();
	}
}
