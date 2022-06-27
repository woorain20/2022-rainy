package passionjava006;

public class CharTypeUnicode06 {
	public static void main(String[] args) {
		char ch1 = '얼';
		char ch2 = '응';
		char ch3 = '캉';
		String s1 = "아아";
		String s2 = "얼큰";
		char ch4 = 55101;
		char ch5 = 54978;
		char ch6 = 0xD1D8;
		char ch7 = 0xD049;
		char ch8 = 0xC672;
		System.out.println(ch1+""+ch2+""+ch3);
		System.out.println(ch4+""+ch5+""+ch6+""+ch7+""+ch8);
		System.out.println(s1+""+s2);
		System.out.println(ch1+""+s1+""+ch2+""+s2+""+ch3);
		System.out.println(ch4+""+ch5+""+s1+""+s2+""+ch6+""+ch7);
	}

}
