package passionjava018;

public class PrinterDriver4 {
	public static void main(String[] args) {
		String myDoc="This is a report about....";
		ColorPrintable prn = new Prn909Drv();
		prn.print(myDoc);
		System.out.println();
		prn.printCMYK(myDoc);
	}
}
