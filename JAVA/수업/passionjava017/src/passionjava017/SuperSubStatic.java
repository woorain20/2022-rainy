package passionjava017;

public class SuperSubStatic {
	public static void main(String[] args) {
		SuperCLS3 obj1=new SuperCLS3(); 	//count ���� 1 ����
		SuperCLS3 obj2=new SuperCLS3();		//count ���� 1 ����
		
		//�Ʒ� �ν��Ͻ� ���� �������� SuperCLS3 ������ ȣ��ǹǷ�,
		SubCLS3 obj3=new SubCLS3();		//count ���� 1 ����
		SubCLS3 obj4=new SubCLS3();		//count ���� 1 ����
		obj4.showCount();
	}
}
