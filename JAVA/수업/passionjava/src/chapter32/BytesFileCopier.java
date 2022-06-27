package chapter32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BytesFileCopier {
	public static void main(String[] args) {
		//���� - ���� ����� �� �� ���
		//ctrl+shift+o = �ڵ� import 
		//���� ����
		//���� - ��� ������ ������ �ӽ� ����
		//��Ʈ�� = �޸� -> �ϵ��ũ
		//��Ʈ��: ���������� ������� �Ͼ� ���� ��
		try(InputStream in=new FileInputStream("data.dat");
			OutputStream out=new FileOutputStream("data2.dat")) {
			//1024byte=1kbyte
			byte[] buf=new byte[1024];
			int data;
			while(true) {
//				data=in.read();
				data=in.read(buf);
				if(data==-1) {
					break;
				}
				System.out.println(data);
				out.write(buf,0,data);
			}
				
		}catch(IOException e) {
			e.getMessage();
		}
	}

}
