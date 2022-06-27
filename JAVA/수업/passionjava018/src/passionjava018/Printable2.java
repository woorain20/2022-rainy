package passionjava018;

public interface Printable2 {
	public void print(String doc);
	default void printCMYK(String doc) {}
}
