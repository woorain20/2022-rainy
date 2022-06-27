package passionjava016;

public class Box3 {
	
	private String Contents;
	private int Number;
	
	public Box3(int num, String con) {
		Number=num;
		Contents=con;
	}
	public int getNumber() {
		return Number;
	}
	public String toString() {
		return Contents;
	}

}
