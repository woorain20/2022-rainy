package passionjava009;

public class ContinueBasic04 {
	public static void main(String[] args) {
		int num=0;
		int count=0;
		
		while((num++)<=2500) {
			if((num%23!=0)||(num%25!=0))
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count: "+count);
	}
}
