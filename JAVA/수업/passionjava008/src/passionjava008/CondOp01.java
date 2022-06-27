package passionjava008;

public class CondOp01 {
	public static void main(String[] args) {
		int num1=100;
		int num2=130;
		int num3=180;
		int big;
		int diff;
		
		big=(num1>num2)?num1:num2;
		big=(num2>num3)?num2:num3;
		System.out.println("Å« ¼ö: "+big);
		
		diff=(num1>num2)?(num1-num2):(num2-num1);
		diff=(num2>num3)?(num2-num3):(num3-num2);
		System.out.println("Àý´ñ°ª: "+diff);
	}
}
