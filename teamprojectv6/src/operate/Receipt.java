package operate;

import dto.HotelVO;

public class Receipt {
		
	public void Room(HotelVO hotelVO) {
		String phoneNum = hotelVO.getPhoneNum();    
		int night = hotelVO.getNight();       
		String name = hotelVO.getName();  
		String bookNumber=hotelVO.getBooknumber();
		int year=hotelVO.getYear();
		int month=hotelVO.getMonth();
		int day=hotelVO.getDay();
		double tocost= hotelVO.getCost();
		String room = hotelVO.getRoom();

	

		System.out.println();
		System.out.println("\t\t ����Ȯ�� \t\t");;
		System.out.println("�����ȣ : "+bookNumber);
		System.out.println("������ : "+name);
		System.out.println("����ó : "+phoneNum);
		System.out.println("���� ��ǰ : "+room);
		System.out.println("üũ��: "+year+"-"+month+"-"+day);
		System.out.println("�̿�Ⱓ : "+night+"�� "+(night+1)+"��");
		
		if(room.equals("�̱۷�")) {
			
			System.out.println("�̿��� : "+(int)tocost+"��");
			System.out.println("�� 1|ħ�� 1|��� 1|���Ǻ�");
			System.out.println("���� : ���� | �̴Ϲ� ");
		}else if(room.equals("�����")) {

			System.out.println("�̿��� : "+(int)tocost+"��");
			System.out.println("�ִ��ο� : 2");
			System.out.println("�� 1|ħ�� 2|��� 1|���Ǻ�");
			System.out.println("���� : ���� | �̴Ϲ�");
		}else if(room.equals("Ʈ����")) {

			System.out.println("�̿��� : "+(int)tocost+"��");
			System.out.println("�ִ��ο� : 2");
			System.out.println("�� 2|ħ�� 2|��� 1|����ƾ��");
			System.out.println("���� : ���� | �̴Ϲ�");
		}else if(room.equals("����Ʈ��")) {

			System.out.println("�̿��� : "+(int)tocost+"��");
			System.out.println("�ִ��ο� : 4");
			System.out.println("�� 2|ħ�� 4|��� 2|����ƾ��");
			System.out.println("���� : ���� | �̴Ϲ� | �ｺ��");
		}
		System.out.println("\t\t ������ �Ϸ�Ǿ����ϴ�. \t");
	
	}
		
}