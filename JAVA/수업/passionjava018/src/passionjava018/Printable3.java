package passionjava018;

public interface Printable3 {
	public static void printLine(String str) {
		System.out.println(str);
	}
	default void print(String doc) {
		printLine(doc);	
	}
}
