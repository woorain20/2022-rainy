package passionjava008;

public class IEIE01 {
	public static void main(String[] args) {
		int num=160;
		if(num<0) {	//���� �˻�
			System.out.println("0�̸�");
	}else if(num<100) { //�� ������ �������� ������ ���⼭ �ٽ� �˻�
		System.out.println("0�̻� 100�̸�");
	}else if(num<200) { //�� ������ �������� ������ ���⼭ �ٽ� �˻�
		System.out.println("100�̻� 200�̸�");
	}else { //�ƹ��͵� �������� ������ else�� ���� ���� ����
		System.out.println("200�̻�");
	}

	}
}