package passionjava010;

public class MethodDef03 {
	public static void main(String[] args) {
		System.out.println("Hello");
		hiEveryone(1.5);
		hiEveryone(2.0);
		hiEveryone(2.5);
		hiEveryone(3.0);
		hiEveryone(3.5);
		System.out.println("Exit");
	}
	public static void hiEveryone(double zoom) {
		System.out.println("Camera Start");
		System.out.println("Zoom In"+zoom);
	}
}
