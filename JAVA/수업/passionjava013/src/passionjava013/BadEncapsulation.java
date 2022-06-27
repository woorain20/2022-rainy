package passionjava013;

public class BadEncapsulation {
	public static void main(String[] args) {
		ColdPatient suf=new ColdPatient();
		
		//Äà¹° Ä¸½¶ ±¸¸Å ÈÄ º¹¿ë
		suf.takeSinivelCap(new SinivelCap());
		//ÀçÃ¤±â Ä¸½¶ ±¸¸Å ÈÄ º¹¿ë
		suf.takeSneezeCap(new SneezeCap());
		//ÄÚ¸·Èû Ä¸½¶ ±¸¸Å ÈÄ º¹¿ë
		suf.takeSnuffleCap(new SnuffleCap());
	}
}
