package movie;

public class MovieName {
	private String name;
	private int limit;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	public void print() {
		System.out.println("��ȭ: "+name);
		System.out.println("�󿵵��: "+limit);
	}

}
