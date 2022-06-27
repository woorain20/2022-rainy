package passionjava007;

public class SEC04 {
	public static void main(String[] args) {
		int num1=4;
		int num2=31;
		boolean result;
		
		result=((num1+=12)<0)&&((num2-=10)>0);
		System.out.println("result="+result);
		System.out.println("num1="+num1);
		System.out.println("num2="+num2+'\n'); //'\n'Àº °³ Çà
		result=((num1+=12)>0)&&((num2-=10)>0);
		System.out.println("result="+result);
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}

}
