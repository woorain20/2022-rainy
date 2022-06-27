package passionjava018;

public class InstanceofInterface {
	public static void main(String[] args) {
		Printable4 prn1=new SimplePrinter2();
		Printable4 prn2=new MultiPrinter();
		
		if(prn1 instanceof Printable4) {
			prn1.printLine("This is a simple printer");
		}
		System.out.println();
		
		if(prn2 instanceof Printable4) {
			prn2.printLine("This is a mulil printer");
		}
	}

}
