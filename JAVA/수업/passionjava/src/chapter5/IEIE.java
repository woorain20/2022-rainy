package chapter5;

public class IEIE {
	//FBI, CSI ���� ���Ӹ��� �빮�ڷ� ����
	public static void main(String[] args) {
		int num=120;
		//���� �ִ� ���ǿ� �ɸ��� ����. �ؿ� ���յǴ� ������ ����.
		if(num<0){
			System.out.println("0 �̸�");
		}else if(num<100) {
			System.out.println("0 �̻� 100 �̸�");
		}else if(num<200) {
			System.out.println("0 �̻� 200 �̸�");
		}else if(num<300) {
			System.out.println("0 �̻� 300 �̸�");
			//else if���� ������ �߰��� �� ����
		}else {
			System.out.println("300 �̻�");
			//else ������ ��������
		}
		System.out.println("���� ��");
	}

}
