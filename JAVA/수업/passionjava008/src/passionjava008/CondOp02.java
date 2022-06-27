package passionjava008;

public class CondOp02 {
	public static void main(String[] args) {
		int num1=50;
		int num2=75;
		int num3=55;
		int num4=90;
		int big1;
		int big2;
		int big3;
		int diff1;
		int diff2;
		int diff3;
		
		big1=(num1>num2)?num1:num2;
		System.out.println(big1);
		big2=(num3>num4)?num3:num4;
		System.out.println(big2);
		big3=(big1>big2)?big1:big2;
		System.out.println("Å« ¼ö: "+big3);
		
		diff1=(num1>num2)?(num1-num2):(num2-num1);
		System.out.println(diff1);
		diff2=(num3>num4)?(num3-num4):(num4-num3);
		System.out.println(diff2);
		diff3=(diff1>diff2)?(diff1-diff2):(diff2-diff1);
		System.out.println("Àý´ñ°ª: "+diff3);
	}
}
