package passionjava009;

public class ContinueBasic03 {
	public static void main(String[] args) {
		int num=0;
		int count=0;
		
		while((num++)<1000) {
			if((num%21!=0)||(num%23!=0))
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count: "+count);
	}
}
