package passionjava021;

public class HowLongSequential {
	public static long fibonacci(long n) {
		if(n==1||n==2) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}

}
