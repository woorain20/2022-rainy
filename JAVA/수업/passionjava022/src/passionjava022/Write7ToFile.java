package passionjava022;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile {
	public static void main(String[] args) throws IOException{
		OutputStream out=new FileOutputStream("data.dat");	//��� ��Ʈ�� ����
		out.write(7); 	//7�� ����
		out.close(); 	//��Ʈ�� ����
	}

}
