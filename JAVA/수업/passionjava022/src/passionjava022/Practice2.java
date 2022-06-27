package passionjava022;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice2 {
	public static void main(String[] args) {
		try(DataOutputStream out=new DataOutputStream(new FileOutputStream("cake2.txt"))){
			out.writeInt(5000);
			out.writeInt(6000);
			out.writeDouble(15.5);
			out.writeDouble(0.75);
			System.out.println();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(DataInputStream in=new DataInputStream(new FileInputStream("cake2.txt"))){
			int num1=in.readInt();
			double num2=in.readDouble();
			
			System.out.println(num1);
			System.out.println(num2);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
