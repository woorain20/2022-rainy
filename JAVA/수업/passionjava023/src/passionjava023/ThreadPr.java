package passionjava023;

public class ThreadPr {
	String response;
	
	public ThreadPr(String rs) {
		response=rs;
	}
	
	public void answer() {
		System.out.println(response+" �� �����ص帮�ڽ��ϴ�.");
		for(int i=0;i<60;i++) {
			System.out.println(i+"�ʰ� ����Ǿ����ϴ�.");
		}
		System.out.println("����� ���� "+response+" ������ �ʾ����� �ֽ��ϴ�.");
	}
	
	public static void main(String[] args) {
		String[] rs=new String[] {"����", "����", "�ݼ���"};
		
		for(int i=0;i<rs.length;i++) {
			ThreadPr pr=new ThreadPr(rs[i]);
			pr.answer();
		}
	}

}
