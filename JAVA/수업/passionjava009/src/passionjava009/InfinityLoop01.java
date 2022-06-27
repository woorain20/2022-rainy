package passionjava009;

public class InfinityLoop01 {
	public static void main(String[] args) {
		int num=1;
		while(true) {
			if(((num%7)==0)&&((num%17)==0))
				break;
			num++;
		}
		System.out.println(num);
	}
}
