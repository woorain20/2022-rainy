package operate;

import dto.HotelVO;


public class Receipt {
		
	public void Singleroom(HotelVO hotelVO) {
		int phoneNum = hotelVO.getPhoneNum();    //����ȣ<--view���� ��������
		int night = hotelVO.getNight();       //�̿�Ⱓ
		String name = hotelVO.getName();  //�̸� 
		String bookNumber=hotelVO.getBooknumber();
		int cost = 70000; //���

		    System.out.println(" ");
			System.out.println("\t\t ����Ȯ�� \t\t");;
			System.out.println("�����ȣ : "+bookNumber);
			System.out.println("������ : "+name);
			System.out.println("����ó : "+phoneNum);
			System.out.println("���� ��ǰ : Single Room");
			System.out.println("�̿�Ⱓ : "+night);
			System.out.println("�⺻��� : "+cost);
			System.out.println("�� 1|ħ�� 1|��� 1|���Ǻ�");
			System.out.println("���� : ���� | �̴Ϲ� ");
			System.out.println("\t\t ������ �Ϸ�Ǿ����ϴ�. \t");
		
}
		
	public void Doubleroom(HotelVO hotelVO) {
		int phoneNum = hotelVO.getPhoneNum();    //����ȣ<--view���� ��������
		int night = hotelVO.getNight();       //�̿�Ⱓ
		String name = hotelVO.getName();  //�̸� 
		String bookNumber=hotelVO.getBooknumber();
		int cost = 100000; //���

		    System.out.println(" ");
			System.out.println("\t\t ������������ �ҷ��帮�ڽ��ϴ�.\t");
			System.out.println("�����ȣ : "+bookNumber);
			System.out.println("������ : "+name);
			System.out.println("����ó : "+phoneNum);
			System.out.println("���� ��ǰ : Double Room");
			System.out.println("�̿�Ⱓ : "+night);
			System.out.println("�⺻��� : "+cost);
			System.out.println("�ִ��ο� : 2");
			System.out.println("�� 1|ħ�� 2|��� 1|�ٴٺ�");
			System.out.println("���� : ���� | �̴Ϲ�");
			System.out.println("\t\t �̿� ����帳�ϴ�. \t");
			
}
	public void TwinRoom(HotelVO hotelVO) {
		int phoneNum = hotelVO.getPhoneNum();    //����ȣ<--view���� ��������
		int night = hotelVO.getNight();       //�̿�Ⱓ
		String name = hotelVO.getName();  //�̸� 
		String bookNumber=hotelVO.getBooknumber();
		int cost = 100000; //���

		    System.out.println(" ");
			System.out.println("\t\t ������������ �ҷ��帮�ڽ��ϴ�.\t");
			System.out.println("�����ȣ : "+bookNumber);
			System.out.println("������ : "+name);
			System.out.println("����ó : "+phoneNum);
			System.out.println("���� ��ǰ : Twin Room");
			System.out.println("�̿�Ⱓ : "+night);
			System.out.println("�⺻��� : "+cost);
			System.out.println("�ִ��ο� : 2");
			System.out.println("�� 2|ħ�� 2|��� 1|����ƾ��");
			System.out.println("���� : ���� | �̴Ϲ�");
			System.out.println("\t\t �̿� ����帳�ϴ�. \t");
			
		
		}			
		public void suiteroom(HotelVO hotelVO) {
			int phoneNum = hotelVO.getPhoneNum();    //����ȣ<--view���� ��������
			int night = hotelVO.getNight();       //�̿�Ⱓ
			String name = hotelVO.getName();  //�̸� 
			String bookNumber=hotelVO.getBooknumber();
				int cost = 200000; //���

					System.out.println(" ");
					System.out.println("\t\t ������������ �ҷ��帮�ڽ��ϴ�.\t");
					System.out.println("�����ȣ : "+bookNumber);
					System.out.println("������ : "+name);
					System.out.println("����ó : "+phoneNum);
					System.out.println("���� ��ǰ : Suite Room");
					System.out.println("�̿�Ⱓ : "+night);
					System.out.println("�⺻��� : "+cost);
					System.out.println("�ִ��ο� : 4");
					System.out.println("�� 2|ħ�� 4|��� 2|����ƾ��");
					System.out.println("���� : ���� | �̴Ϲ� | �ｺ��");
					System.out.println("\t\t �̿� ����帳�ϴ�. \t");

			}
}