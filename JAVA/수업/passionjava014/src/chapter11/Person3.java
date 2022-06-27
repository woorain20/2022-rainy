package chapter11;

public class Person3 {
	private int regiNum;
	private int passNum;
	private int drivNum;
	
	public Person3(int rnum, int pnum, int dnum){
		this.regiNum=rnum;
		this.passNum=pnum;
		this.drivNum=dnum;
		
	}
		
	public void showPersonalInfo() {
		System.out.println("�ֹι�ȣ: "+regiNum);
		if(passNum!=0) {
			System.out.println("���ǹ�ȣ: "+passNum);
		}else {
			System.out.println("���� ����");
		}
		if(drivNum!=0) {
			System.out.println("��������: "+drivNum+'\n');
		}else {
			System.out.println("�������� ����\n");
		}
	}
	
	public static void main(String[] args) {
		Person3 kim=new Person3(15556, 15886, 87566);
		Person3 lee=new Person3(75416, 0, 46762);
		Person3 park=new Person3(157416, 15480, 0);
		Person3 jung=new Person3(4435416, 18770, 46762);
		Person3 choi=new Person3(9715416, 0, 0);
		
		kim.showPersonalInfo();
		lee.showPersonalInfo();
		park.showPersonalInfo();
		jung.showPersonalInfo();
		choi.showPersonalInfo();
		
	}
}
