package passionjava022;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7FromFile {
	public static void main(String[] args) throws IOException{
		InputStream in =new FileInputStream("data.dat"); 	//�Է� ��Ʈ�� ����
		int dat=in.read(); 	//������ ����
		in.close(); 	//�Է� ��Ʈ�� ����
		
		System.out.println(dat);
	}
}
