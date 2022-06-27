package passionjava023;

public class PrinterMain2 {
	public static void main(String[] args) {
		Printable2 prta=(String s, String o)->{
//			System.out.println("Team: "+s);
//			System.out.println("Position: "+o);
			System.out.println("Team: "+s+"\t\t"+"Position: "+o);
		};
		prta.print("Arsenal", "FW");
		
		Printable3 prtb=(String s, int num)->{
//			System.out.println("Name: "+s);
//			System.out.println("Number: "+num);
			System.out.println("Name: "+s+"\t"+"Number: "+num);
		};
		prtb.print("Bukayo Saka", 7);
		
		Printable4 prtc=(int num1, int num2)->{
//			System.out.println("Goal: "+num1);
//			System.out.println("Assist: "+num2);
			System.out.println("Goal: "+num1+"\t"+"Assist: "+num2);
		};
		prtc.print(11, 6);
		
		System.out.println();
		Printable2 prta2=(String s, String o)->{
			System.out.println("Team: "+s+"\t\t"+"Position: "+o);
		};
		prta2.print("Arsenal", "MF");
		
		Printable3 prtb2=(String s, int num)->{
			System.out.println("Name: "+s+"\t"+"Number: "+num);
		};
		prtb2.print("Thomas Partey", 5);
		
		Printable4 prtc2=(int num1, int num2)->{
			System.out.println("Goal: "+num1+"\t\t"+"Assist: "+num2);			
		};
		prtc2.print(2, 1);
	}
}
