package view;



import java.util.Scanner;

import dto.HotelVO;
import roomif.DoubleRoom;
import roomif.SingleRoom;
import roomif.SuiteRoom;
import roomif.TwinRoom;

public class ViewRoom {
	Scanner sc=new Scanner(System.in);

	
	//���� ����
	public void Room() {
		
		while(true) {
			System.out.println();
			System.out.println("�Ʒ��� �� �� ���Ͻô� ���� �������ּ���");
			System.out.println("=============================");
			System.out.println("�̱� || ���� || Ʈ�� || ����Ʈ");
			System.out.print("Room: ");
			String room=sc.nextLine();
		
			if(room.equals("�̱�")) {
				System.out.println("�̱۷��� �����ϼ̽��ϴ�.");
				SingleRoom sr=new SingleRoom();
				sr.single();
				break;
			}else if(room.equals("����")) {
				System.out.println("������� �����ϼ̽��ϴ�.");
				DoubleRoom dr=new DoubleRoom();
				dr.Double();
				break;
			}else if(room.equals("Ʈ��")) {
				System.out.println("Ʈ������ �����ϼ̽��ϴ�.");
				TwinRoom tr=new TwinRoom();
				tr.Twin();
				break;
			}else if(room.equals("����Ʈ")) {
				System.out.println("����Ʈ���� �����ϼ̽��ϴ�.");
				SuiteRoom su=new SuiteRoom();
				su.Suite();
				break;
			}else {
				System.out.println("�߸� �����ϼ̽��ϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
			}
		}
		System.out.println();
	}
			
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ViewRoom vr=new ViewRoom();
		String room=sc.nextLine();
	
	}


}
