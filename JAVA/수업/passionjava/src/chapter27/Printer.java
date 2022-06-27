package chapter27;

import chapter1701.Printable;

public class Printer implements Printable, chapter27.Printable {

	@Override
	public void print(String doc) {
		System.out.println(doc);

	}
	public static void main(String[] args) {
		Printer printer=new Printer();
		System.out.println("Hello World");
	}

}
