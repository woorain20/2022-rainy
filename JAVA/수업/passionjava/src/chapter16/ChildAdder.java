package chapter16;

public class ChildAdder extends ParentAdder {

	//�޼ҵ� ���ٶ��̵尡 �ƴϰ� �޼ҵ� �����ε�
//	public double add(double a, double b) {
//		System.out.println("������ �����մϴ�.");
//		return a+b;
//	}
	
	//���α׷����� �Ǽ��ϴ� ��Ȳ�� ���� ���� ������̼��� ���ش�
	@Override // ������̼�, �������̵� ������ ����� ���� ǥ�ð� ��Ÿ��
	public int add(int a, int b) {
		System.out.println("������ �����մϴ�.");
		return a+b;
	}
	
	

}
