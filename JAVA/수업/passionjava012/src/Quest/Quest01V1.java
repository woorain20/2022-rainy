package Quest;

public class Quest01V1 {
	private String company;
	private String driver;
	private String num;
	private String start;
	private String stop;
	private String time;
	private String first;
	private String last;
	
	public Quest01V1(String co, String dr, String n, String sta, String op, String ti, String fi, String la) {
		company=co;
		driver=dr;
		num=n;
		start=sta;
		stop=op;
		time=ti;
		first=fi;
		last=la;
	}
	
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
		
		Quest01V1 information=new Quest01V1("�������","�ڿ���","724","����","ĥ��","15��","5�� 40��","10�� 15��");
		information.print();
		
		Quest01V1 information2=new Quest01V1("�������","�����","425","���","ȭ��","30��","5�� 50��","10�� 5��");
		information2.print();
		
		Quest01V1 information3=new Quest01V1("���Ͽ��","�赿��","����3","�ݾ߿�","����","20��","6��","10�� 30��");
		information3.print();
		
		Quest01V1 information4=new Quest01V1("�������","�̼���","����1","����","�Ȱ���","30��","6�� 5��","10�� 10��");
		information4.print();
		
		System.out.println("���� �Ϸ� �Ǽ���.");
	}
}
