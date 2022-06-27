package passionjava009;

public class InfinityLoop04 {
	public static void main(String[] args) {
		int num=1;
		while(true) {
			if(((num%6)==0)&&((num%15)==0))
				break;
			num++;
			System.out.println("-----");
		}
		System.out.println(num);
	}
}
