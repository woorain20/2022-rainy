package operate;



public class ViewRoom {


	public static String room;	
	//���� ����
	public void Room(int roomM) {		
			if(roomM==1) {
				room="�̱۷�";
				System.out.println("�̱۷��� �����ϼ̽��ϴ�.");
				int cost = 700000;           
				System.out.println("�̱۷��� �⺻����� "+ cost + "���Դϴ�."); 
			
			}else if(roomM==2) {
				room="�����";
				System.out.println("������� �����ϼ̽��ϴ�.");
				int cost = 100000;        
				System.out.println("������� �⺻����� "+ cost  + "���Դϴ�.");
			
			}else if(roomM==3) {
				room="Ʈ����";
				System.out.println("Ʈ������ �����ϼ̽��ϴ�.");
				int cost = 120000;           
				System.out.println("Ʈ������ �⺻����� "+ cost + "���Դϴ�.");
			
			}else if(roomM==4) {
				room="����Ʈ��";
				System.out.println("����Ʈ���� �����ϼ̽��ϴ�.");
				int cost = 300000;           
				System.out.println("����Ʈ���� �⺻����� "+ cost + "���Դϴ�.");
			
			}else {
				System.out.println("�߸� �����ϼ̽��ϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
			}
			System.out.println("�ָ� 25%, ������ 50% �߰������ �ֽ��ϴ�.");
			System.out.println();
		}

				

}
