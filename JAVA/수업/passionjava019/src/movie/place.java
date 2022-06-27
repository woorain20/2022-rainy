package movie;

public class place {
	private int num;
	private int quota;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCustomer() {
		return quota;
	}
	public void setCustomer(int quota) {
		this.quota = quota;
	}
	
	public void print() {
		System.out.println("惑康包: "+num);
		System.out.println("沥盔: "+quota);
	}
	
	public void take() {
		System.out.println("1包");
	}
	public void take2() {
		System.out.println("2包");
	}
	public void take3() {
		System.out.println("3包");
	}

}
