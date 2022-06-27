package passionjava023;

import passionjava023.Printable;

public class Printer implements Printable {

	@Override
	public void print(String doc) {
		System.out.println(doc);

	}
	public static void main(String[] args) {
		Printer pr=new Printer();
		System.out.println("Hello Java");
	}

}
