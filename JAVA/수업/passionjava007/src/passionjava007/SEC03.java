package passionjava007;

public class SEC03 {
	public static void main(String[] args) {
		int num1=5;
		int num2=12;
		boolean result;
		result=((num1+=10)<0)&&((num2+=10)>0);
		System.out.println("result="+result);
		System.out.println("num1="+num1);
		System.out.println("num2="+num2+'\n'); // '\n'?? ?? ??
		result=((num1+=10)>0)&&((num2+=10)>0);
		System.out.println("result="+result);
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}
}
