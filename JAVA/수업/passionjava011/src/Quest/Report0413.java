package Quest;

public class Report0413 {
	private String name;
	private String title;
	private String classroom;
	private String target;
	private String test;
	int people = 0;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public int Mpeople(int empty) {
		people +=empty;
		return people;
	}
	public void printout() {
		System.out.println("����� : "+name);
		System.out.println("���ǳ��� : "+title);
		System.out.println("���ǽ� : "+classroom);
		System.out.println("������: "+target);
		System.out.println("�н�Ȯ�� : "+test);
	}
	public int printE() {
	System.out.println("���� : "+people+"��");
	return people;
	}
	public void intro() {
		System.out.println("������ ���������ȳ�");
	}
	public void outro() {
		System.out.println("�����մϴ�.");
	}
	public static void main(String[] args) {
		Report0413 Do=new Report0413();
		Do.setName("�常ȣ");
		Do.setTitle("������ ����");
		Do.setClassroom("2�� 606ȣ");
		Do.setTarget("����������");
		Do.setTest("�����׽�Ʈ");
		Do.Mpeople(15);
		Do.intro();
		Do.printout();
		Do.printE();
		Do.outro();
		
		System.out.println("\n");
		Report0413 Jang=new Report0413();
		Jang.setName("�ڰ���");
		Jang.setTitle("����");
		Jang.setClassroom("3�� 301ȣ");
		Jang.setTarget("������������������");
		Jang.setTest("�����׽�Ʈ");
		Jang.Mpeople(5);
		Jang.intro();
		Jang.printout();
		Jang.printE();
		Jang.outro();
		
		System.out.println("\n");
		
		Report0413 Gong=new Report0413();
		Gong.setName("������");
		Gong.setTitle("�ѱ���");
		Gong.setClassroom("1�� 303ȣ");
		Gong.setTarget("������������");
		Gong.setTest("�����׽�Ʈ");
		Gong.Mpeople(0);
		Gong.intro();
		Gong.printout();
		Gong.printE();
		Gong.outro();
		
		
	}

}
