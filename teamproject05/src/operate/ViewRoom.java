package operate;


public class ViewRoom {
	
	public static String roomN;
	//���� ����
	public void Room(int room) {		
			if(room==1) {
				roomN="�̱۷�";
				System.out.println("�̱۷��� �����ϼ̽��ϴ�.");
				int cost = 700000;           
				System.out.println("�̱۷��� �⺻����� "+ cost + "���Դϴ�."); 
			
			}else if(room==2) {
				roomN="�����";
				System.out.println("������� �����ϼ̽��ϴ�.");
				int cost = 100000;        
				System.out.println("������� �⺻����� "+ cost  + "���Դϴ�.");
			
			}else if(room==3) {
				roomN="Ʈ����";
				System.out.println("Ʈ������ �����ϼ̽��ϴ�.");
				int cost = 120000;           
				System.out.println("Ʈ������ �⺻����� "+ cost + "���Դϴ�.");
			
			}else if(room==4) {
				roomN="����Ʈ��";
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
