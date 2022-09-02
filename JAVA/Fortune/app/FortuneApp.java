package app;

import controller.FortuneController;

public class FortuneApp {
	
	public static void main(String[] args) {
		
		FortuneController fortuneController=new FortuneController();
		
		//C
		fortuneController.createFortune(0,"���ڹ�0","����� ã�ƿ´�.");
		fortuneController.createFortune(1,"���ڹ�1","������ �Ϸ簡 ����");
		fortuneController.createFortune(2,"���ڹ�2","���� �����´�.");
		fortuneController.createFortune(3,"���ڹ�3","������ ������.");
		fortuneController.createFortune(4,"���ڹ�4","����� �Ϸ簡 �ɰ�");
//		System.out.println();
		

		//R
//		fortuneController.getFortunes();
//		System.out.println();
		
		//U
//		FortuneVO fortuneVO1=new FortuneVO();
//		fortuneVO1.setId(3);
//		fortuneVO1.setName("");
//		fortuneVO1.setFortuneStr("������ �");
//		fortuneController.putFortune(fortuneVO1);
		//R
//		fortuneController.getFortunes();
//		System.out.println();
		
		//D
//		FortuneVO fortuneVO2=new FortuneVO();
//		fortuneVO2.setId(4);
//		fortuneController.deleteFortune(fortuneVO2);
		//R
//		fortuneController.getFortunes();
//		System.out.println();
		
		//���� 10�� ����
//		for(int i=0;i<10;i++) {
//			fortuneController.getFortune();
//		}
//		System.out.println();
		
		//�� ����
		fortuneController.runApp();
	}

}
