package chapter5;

public class ForlnFor {
	public static void main(String[] args) {
		for(int i=0;i<3;i++) {//�ٱ��� for��
			System.out.println("----------------");
			for(int j=0;j<3;j++) {//���� for��
				System.out.print("["+i+","+j+"]");				
			}
			System.out.println("\n");
		}
	}
}
