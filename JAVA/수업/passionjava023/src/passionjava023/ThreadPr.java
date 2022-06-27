package passionjava023;

public class ThreadPr {
	String response;
	
	public ThreadPr(String rs) {
		response=rs;
	}
	
	public void answer() {
		System.out.println(response+" 를 연결해드리겠습니다.");
		for(int i=0;i<60;i++) {
			System.out.println(i+"초가 경과되었습니다.");
		}
		System.out.println("상담이 많아 "+response+" 연결이 늦어지고 있습니다.");
	}
	
	public static void main(String[] args) {
		String[] rs=new String[] {"상담사", "고객팀", "콜센터"};
		
		for(int i=0;i<rs.length;i++) {
			ThreadPr pr=new ThreadPr(rs[i]);
			pr.answer();
		}
	}

}
