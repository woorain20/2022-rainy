package passionjava021;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class HowLongParallel extends HowLongSequential{
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(41,42,43,44,45,46,47);
		
		Instant start=Instant.now();	//스톱워치 시작
		nums.parallelStream().map(n->fibonacci(n)).forEach(r->System.out.println(r));	//병렬 스트림 생성
		
		Instant end=Instant.now();	//스톱워치 멈춤
		System.out.println("Parallel Processing Time: "+Duration.between(start, end).toMillis());
	}
}
