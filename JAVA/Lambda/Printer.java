package chapter27;

import chapter17001.Printable;

public class Printer implements Printable {

	@Override
	public void print(String doc) {
		System.out.println(doc);
	}
	
	public static void main(String[] args) {
		Printer printer=new Printer();
		printer.print("Hello World!");
	}

}
