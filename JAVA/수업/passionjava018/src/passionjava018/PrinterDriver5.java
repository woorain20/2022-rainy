package passionjava018;

public class PrinterDriver5 {
	public static void main(String[] args) {
		String myDoc="This is a report about....";
		Printable2 prn1=new Prn650Drv();
		prn1.print(myDoc);;
		System.out.println();
		
		Printable2 prn2=new Prn850Drv();
		prn2.print(myDoc);
	}

}
