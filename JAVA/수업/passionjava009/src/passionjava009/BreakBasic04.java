package passionjava009;

public class BreakBasic04 {
	public static void main(String[] args) {
		int num=1;
		boolean search=false;
		
		while(num<=10) {
			if((num%8==0)&&(num%12==0)) {
				search=true;
				break;
			}
			num++;
		}
		if(search) {
			System.out.println("찾는 정수: "+num);
		}else {
			System.out.println("Error");
		}
	}
}
