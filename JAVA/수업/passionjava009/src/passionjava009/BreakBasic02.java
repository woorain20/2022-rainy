package passionjava009;

public class BreakBasic02 {
	public static void main(String[] args) {
		int num=1;
		boolean search=false;
		
		//ó�� ������ 11�� ������� 15�� ����� ���� ã�� �ݺ���
		while(num<150) {
			if((num%11==0)&&(num%15==0)) {
				search=true;
				break;	//while���� Ż��
			}
			num++;
		}
		if(search) {
			System.out.println("ã�� ����: "+num);
		}else {
			System.out.println("11�� ������� 15�� ����� ã�� ���߽��ϴ�.");
		}
	}
}
