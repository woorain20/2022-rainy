package chapter11;

public class Person2 {

	private int regiNum;
	private int passNum;
	
	public Person2(int rnum, int pnum){
		regiNum=rnum;
		passNum=pnum;
	}
	
	public Person2(int rnum){
		regiNum=rnum;
		passNum=0;
	}
	public void showPersonalInfo() {
		System.out.println("�ֹι�ȣ: "+regiNum);
		if(passNum!=0) {
			System.out.println("���ǹ�ȣ: "+passNum+'\n');
		}else {
			System.out.println("������ ������ ���� �ʽ��ϴ�.\n");
		}
	}
}
