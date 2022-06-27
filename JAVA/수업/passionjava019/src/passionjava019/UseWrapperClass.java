package passionjava019;

public class UseWrapperClass {
	public static void showDate(Object obj) {
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		Integer iInst=new Integer(3);
		showDate(iInst);
		showDate(new Double(7.15));
	}

}
