package operate;

import java.util.InputMismatchException;


public class ViewNight {

	
	//���ڱⰣ
	public int Night(int night) {
		while(true) {
			//���ڿ� ����ó��
			try {
				System.out.println(night+"�� "+(night+1)+"���� �����ϼ̽��ϴ�.");
				return night;
			}catch(InputMismatchException e) {
				System.out.println("���ڸ� �Է����ּ���");
			}
			
			System.out.println();
		}

	}
			

}
