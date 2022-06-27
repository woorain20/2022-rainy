package passionjava018;

public class MultiPrinter extends SimplePrinter2 {
	public void printLine(String str) {
		super.printLine("start of multi...");
		super.printLine(str);
		super.printLine("null of multi");
	}
}
