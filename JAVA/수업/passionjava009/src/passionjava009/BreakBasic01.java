package passionjava009;

public class BreakBasic01 {
	public static void main(String[] args) {
		int num=1;
		boolean search=false;
		
		//ó�� ������ 6�� ������� 9�� ����� ���� ã�� �ݺ���
		while(num<50) {
			if((num%6==0)&&(num%9==0)) {
				search=true;
				break;	//while���� Ż��
			}
			num++;
		}
		if(search) {
			System.out.println("ã�� ����: "+num);
		}else {
			System.out.println("6�� ������� 9�� ����� ���� ã�� ���߽��ϴ�.");
		}
	}
}
