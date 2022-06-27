package passionjava021;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class HowLong extends HowLongSequential{
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(40,41,42,43,44,45,46,47);
		
		Instant start=Instant.now();	//스톱워치 시작
		nums.stream().map(n -> fibonacci(n)).forEach(r -> System.out.println(r));	//순차 스트림 생성
		
		Instant end=Instant.now();	//스톱워치 멈춤
		System.out.println("Sequential Processing: "+Duration.between(start, end).toMillis());
	}
}
