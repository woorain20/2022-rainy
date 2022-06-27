package passionjava009;

public class ContinueBasic02 {
	public static void main(String[] args) {
		int num=0;
		int count=0;
		
		while((num++)<1000) {
			if((num%13!=0)||(num%17!=0))
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count: "+count);
	}
}
