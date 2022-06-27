package Quest;
//학생 정보(이름, 꿈, 사는곳)

class info {
	private String name;
	private String dream;
	private String home;
	public void fir(String 이름) {
		this.name=이름;
	}
	protected void sec(String 꿈) {
		this.dream=꿈;
	}
	public void thi(String 사는곳) {
		this.home=사는곳;
	}
	public void print() {
		System.out.println("이름 : "+name);
		System.out.println("꿈 : "+dream);
		System.out.println("사는곳 : "+home);
	}
	
}
