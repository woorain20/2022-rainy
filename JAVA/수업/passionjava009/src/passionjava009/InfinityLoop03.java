package passionjava009;

public class InfinityLoop03 {
	public static void main(String[] args) {
		int num=1;
		while(true) {
			if(((num%11)==0)&&((num%21)==0))
				break;
			num++;
			System.out.println("IL");
		}
		System.out.println(num);
	}
}
