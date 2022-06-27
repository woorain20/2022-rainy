package passionjava018;

public class Prn850Drv implements Printable2 {

	@Override
	public void print(String doc) {
		System.out.println("From MD-850 black & white ver");
		System.out.println(doc);

	}
	
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}

}
