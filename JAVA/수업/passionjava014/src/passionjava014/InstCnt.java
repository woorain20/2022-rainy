package passionjava014;

public class InstCnt {
	static int instNum=0;	//Ŭ���� ����(static ����)
	
	InstCnt(){	//������
		instNum++;	//static���� ����� ������ �� ����
		System.out.println("�ν��Ͻ� ����: "+instNum);
	}

}
