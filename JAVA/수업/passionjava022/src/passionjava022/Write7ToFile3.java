package passionjava022;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile3 {
	public static void main(String[] args) {
		try(OutputStream out=new FileOutputStream("data2.dat")){
			out.write(7);
			System.out.println("출력 성공");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
