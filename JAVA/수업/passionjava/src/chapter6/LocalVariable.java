package chapter6;

public class LocalVariable {
	public static void main(String[] args) {
		int age=0;
		showAge(24,false);
//���� ���������� ���� ���������� ������ ��ġ��, ���� ���������� ���� ���������� �������

	}
	public static void showAge(int ageK,boolean birthPassed) {
		int age=0;
		if(birthPassed) {
			age=ageK-1;	//int age=��������, �߰��� �ȿ��� ������ ��ħ

		}else {
			age=ageK-2;	//int age=��������. ������ �ߺ��Ǿ �߰��ΰ� �ٸ��� ������ ���� �ʴ´�
		}
		System.out.println("�� ����: "+age);
	}
	
}
