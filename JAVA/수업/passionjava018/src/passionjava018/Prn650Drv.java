package passionjava018;

public class Prn650Drv implements Printable2 {

	@Override
	public void print(String doc) {
		System.out.println("From MD-650 printer");
		System.out.println(doc);

	}

}
