package passionjava018;

public class SimplePrinter {
	public static void main(String[] args) {
		String myDoc="This is a report about......";
		Printable3 prn=new Printer2();
		prn.print(myDoc);
		
		Printable3.printLine("end of line");
	}
}
