package passionjava009;

public class ForlnFor {
	public static void main(String[] args) {
		for(int i= 0;i<3;i++) {	//바같쪽 for문
			System.out.println("--------");
			for(int j=0;j<3;j++) { //안쪽 for문
				System.out.print("["+i+","+j+"]");
			}
			System.out.println('\n');
		}
	}
}
