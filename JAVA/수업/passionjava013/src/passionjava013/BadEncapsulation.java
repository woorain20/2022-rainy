package passionjava013;

public class BadEncapsulation {
	public static void main(String[] args) {
		ColdPatient suf=new ColdPatient();
		
		//�๰ ĸ�� ���� �� ����
		suf.takeSinivelCap(new SinivelCap());
		//��ä�� ĸ�� ���� �� ����
		suf.takeSneezeCap(new SneezeCap());
		//�ڸ��� ĸ�� ���� �� ����
		suf.takeSnuffleCap(new SnuffleCap());
	}
}
