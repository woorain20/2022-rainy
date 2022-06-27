package passionjava009;

public class ForlnFor01 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) { //바같쪽 for문
			System.out.println("--------------");
			for(int j=0;j<4;j++) { // 안쪽 for문
				System.out.print("["+i+","+j+"]");
			}
			System.out.println('\n');
		}
	}
}
