package passionjava008;

public class CondOp05 {
	public static void main(String[] args) {
		int num1=54;
		int num2=23;
		int num3=11;
		int num4=15;
		int big1;
		int big2;
		int big3;
		int diff1;
		int diff2;
		int diff3;
		
		big1=(num1>num3)?num1:num3;
		big2=(num2>num4)?num2:num4;
		big3=(big1>big2)?big1:big2;
		System.out.println("가장 큰 수: "+big3);
		
		diff1=(num1>num4)?(num1-num4):(num4-num1);
		diff2=(num2>num3)?(num2-num3):(num3-num2);
		diff3=(diff1>diff2)?(diff1-diff2):(diff2-diff1);
		System.out.println("절댓값: "+diff3);
	}

}
