package passionjava009;

public class Question07 {
	public static void main(String[] args) {
		int num=1;
		int sum=0;
		
		while(true) {
			if((num%2!=0))
				sum+=num;
			if(sum>1000) {
				System.out.println("1000을 넘는 값: "+num);
				System.out.println("초과된 값: "+sum);
				break;
				
			}
			num++;
		}
	}

}
