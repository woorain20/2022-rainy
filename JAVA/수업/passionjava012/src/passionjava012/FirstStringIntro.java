package passionjava012;

public class FirstStringIntro {
	public static void main(String[] args) {
		//���ڿ� ����� ���ÿ� ���������� �����Ѵ�.
		String str1="Happy";
		String str2="Birthday";
		System.out.println(str1+" "+str2);
		
		//�޼ҵ忡 ���ڿ��� �����ϴ� �پ��� ����� �����ش�.
		printString(str1);
		printString(" ");
		printString(str2);
		printString("\n");
		printString("End of Program! \n");
		printString(new String("Hello"));
		
	}
	
	//String ���������� �Ű������� �����Ͽ� ���ڿ��� ���޹��� �� �ִ�.
	public static void printString(String str) {
		System.out.println(str);
	}
}
