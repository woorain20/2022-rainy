package passionjava011;

public class Question01 {
	private String company;
	private String driver;
	private String num;
	private String start;
	private String stop;
	private String time;
	private String first;
	private String last;
	
	
	public void setCompany(String company) {
		this.company=company;
	}
	public void setDriver(String driver) {
		this.driver=driver;
	}
	public void setNum(String num) {
		this.num=num;
	}
	public void setStart(String start) {
		this.start=start;
	}
	public void setStop(String stop) {
		this.stop=stop;
	}
	public void setTime(String time) {
		this.time=time;
	}
	public void setFirst(String first) {
		this.first=first;
	}
	public void setLast(String last) {
		this.last=last;
	}
	public void print() {
		System.out.println("����ȸ��: "+company);
		System.out.println("������: "+driver);
		System.out.println("������ȣ: "+num);
		System.out.println("�����: "+start);
		System.out.println("������: "+stop);
		System.out.println("�����ð�: "+time);
		System.out.println("ù��: "+first);
		System.out.println("��������: "+last+'\n');
	}
	public static void main(String[] args) {
		System.out.println("���� ��ħ�Դϴ�.");
		System.out.println("������ ���� ����"+'\n');
		Question01 information=new Question01();
		information.setCompany("�������");
		information.setDriver("���");
		information.setNum("724");
		information.setStart("����");
		information.setStop("ĥ��");
		information.setTime("15��");
		information.setFirst("5�� 40��");
		information.setLast("10�� 15��");
		information.print();
		
		information.setCompany("�������");
		information.setDriver("�̻�");
		information.setNum("425");
		information.setStart("���");
		information.setStop("ȭ��");
		information.setTime("30��");
		information.setFirst("5�� 50��");
		information.setLast("10�� 5��");
		information.print();
		
		information.setCompany("���Ͽ��");
		information.setDriver("���̹�");
		information.setNum("����3");
		information.setStart("�ݾ߿�");
		information.setStop("����");
		information.setTime("20��");
		information.setFirst("6��");
		information.setLast("10�� 30��");
		information.print();
		System.out.println("���� �Ϸ� �Ǽ���.");
	}
}
