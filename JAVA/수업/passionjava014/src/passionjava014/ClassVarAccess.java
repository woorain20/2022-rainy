package passionjava014;

public class ClassVarAccess {
	public static void main(String[] args) {
		AccessWay way=new AccessWay();
		way.num++;	//�ܺο��� �ν��Ͻ��� �̸��� ���� ����
		AccessWay.num++;	//�ܺο��� Ŭ������ �̸��� ���� ����
		System.out.println("num= "+AccessWay.num);
	}
}
