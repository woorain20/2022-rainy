package passionjava009;

public class ContinueBasic01 {
	public static void main(String[] args) {
		int num=0;
		int count=0;
		
		while((num++)<120) {
			if((num%7!=0)||(num%11!=0))
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count: "+count);
	}
}

