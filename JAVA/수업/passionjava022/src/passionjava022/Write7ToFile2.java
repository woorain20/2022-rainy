package passionjava022;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile2 {
	public static void main(String[] args) throws IOException {
		OutputStream out=null;
		
		try {
			out=new FileOutputStream("data1.dat");
			out.write(7);
		}
		finally {
			if(out !=null)	//출력 스트림 생성에 성공했다면,
				out.close();
		}
	}
}
