package Quest;
//�л� ����(�̸�, ��, ��°�)

class info {
	private String name;
	private String dream;
	private String home;
	public void fir(String �̸�) {
		this.name=�̸�;
	}
	protected void sec(String ��) {
		this.dream=��;
	}
	public void thi(String ��°�) {
		this.home=��°�;
	}
	public void print() {
		System.out.println("�̸� : "+name);
		System.out.println("�� : "+dream);
		System.out.println("��°� : "+home);
	}
	
}
