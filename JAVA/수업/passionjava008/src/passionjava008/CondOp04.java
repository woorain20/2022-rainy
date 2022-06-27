package passionjava008;

public class CondOp04 {
	public static void main(String[] args) {
		int num1=14;
		int num2=32;
		int num3=43;
		int num4=12;
		int big1;
		int big2;
		int big3;
		int diff1;
		int diff2;
		int diff3;
		
		big1=(num1>num2)?num1:num2;
		big2=(num3>num4)?num3:num4;
		big3=(big1>big2)?big1:big2;
		System.out.println("Å« ¼ö: "+big3);
		
		diff1=(num1>num2)?(num1-num2):(num2-num1);
		diff2=(num3>num4)?(num3-num4):(num4-num3);
		diff3=(diff1>diff2)?(diff1-diff2):(diff2-diff1);
		System.out.println("Àý´ñ°ª: "+diff3);
	}
}
