package chapter11;

public class Person {
	private int regiNum;	//�ֹι�ȣ ���
	private int passNum;	//���ǹ�ȣ ���
	
	public Person(int rnum, int pnum){
		regiNum=rnum;
		passNum=pnum;
	}
	
	public Person(int rnum){
		regiNum=rnum;
		passNum=0;
	}
	
	public void showPersonalInfo() {
		System.out.println("�ֹε�Ϲ�ȣ: "+regiNum);
		if(passNum!=0) {
			System.out.println("���ǹ�ȣ: "+passNum+'\n');
		}else {
			System.out.println("������ ������ ���� �ʽ��ϴ�.\n");
		}
	}
}
