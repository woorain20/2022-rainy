package passionjava021;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class HowLongParallel extends HowLongSequential{
	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(41,42,43,44,45,46,47);
		
		Instant start=Instant.now();	//�����ġ ����
		nums.parallelStream().map(n->fibonacci(n)).forEach(r->System.out.println(r));	//���� ��Ʈ�� ����
		
		Instant end=Instant.now();	//�����ġ ����
		System.out.println("Parallel Processing Time: "+Duration.between(start, end).toMillis());
	}
}
