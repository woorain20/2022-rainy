package passionjava022;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataFilterInputStream {
	public static void main(String[] args) {
		try(DataInputStream in=new DataInputStream(new FileInputStream("gate.dat"))){
			int num1=in.readInt(); 	//int�� �����͸� ����
			double num2=in.readDouble(); 	//double�� �����͸� ����
			
			System.out.println(num1);
			System.out.println(num2);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
