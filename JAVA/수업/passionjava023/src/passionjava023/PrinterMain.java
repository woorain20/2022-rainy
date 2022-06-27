package passionjava023;

public class PrinterMain {
	public static void main(String[] args) {
		Printable prt=new Printable() {
			
			@Override
			public void print(String s) {
				
			}
		};
		prt.print("Hello");
		
		Printable prt2=(String s)->{
			System.out.println(s);
		};
		prt2.print("Lambda");
		
		Printable prt3=s->System.out.println(s);
		prt3.print("Biff");
	}

}
