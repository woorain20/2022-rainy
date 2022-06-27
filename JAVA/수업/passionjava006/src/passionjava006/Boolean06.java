package passionjava006;

public class Boolean06 {
	public static void main(String[] args) {
		boolean b1 =true;
		boolean b2 =false;
		System.out.println(b1); // b1이 지닌 값 출력
		System.out.println(b2);
		
		int num1=13;
		int num2=27;
		int num3=29;
		int num4=38;
		int result1=num4-num1;
		int result2=num3-num2;
		int result3=num1+num3;
		int result4=num2+num4;
		System.out.println(num1<num3);
		System.out.println(num2>num3);
		System.out.println(num1+num4<num2+num3);
		System.out.println(num1>num3-num2);
		System.out.println(result1>result2);
		System.out.println(result3<result4);
		System.out.println(result1<result4);
		System.out.println(result2>result3);
		System.out.println(num2+num4<result1);
		System.out.println(num1+num3+num4>result4);
		System.out.println(num1+num2<result2);
		System.out.println(num2+result4>num3+result2);
	}

}
