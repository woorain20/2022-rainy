package passionjava009;

public class InfinityLoop02 {
	public static void main(String[] args) {
		int num=1;
		while(true) {
			if(((num%9)==0)&&((num%19)==0))
				break;
			num++;
			System.out.println("IL");
		}
		System.out.println(num);
	}
}
