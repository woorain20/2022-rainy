package passionjava008;

public class CondOp03 {

	public static void main(String[] args) {
		int num1=45;
		int num2=60;
		int num3=22;
		int num4=12;
		int num5=65;
		int num6=34;
		int big1;
		int big2;
		int big3;
		int big4;
		int big5;
		int diff1;
		int diff2;
		int diff3;
		
		big1=(num1>num2)?num1:num2;
		big2=(num3>num4)?num3:num4;
		big3=(num5>num6)?num5:num6;
		big4=(big1<big2)?big1:big2;
		big5=(big3>big4)?big3:big4;
		System.out.println(big5);
		
		diff1=(num1>num4)?(num1-num4):(num4-num1);
		diff2=(num3>num2)?(num3-num2):(num2-num3);
		diff3=(diff1>diff2)?(diff1-diff2):(diff2-diff1);
		System.out.println(diff3);
	}

}
