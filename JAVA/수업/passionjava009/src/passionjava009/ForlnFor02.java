package passionjava009;

public class ForlnFor02 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println("=========");
			for(int j=0;j<5;j++) {
				System.out.print("["+i+","+j+"]");
			}
			System.out.println('\n');
		}
	}
}
