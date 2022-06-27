package chapter32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteReadFromFile {
	public static void main(String[] args) throws IOException{
		OutputStream out=null;
		try {
			out=new FileOutputStream("data.dat");	//���� ������ ���� �߻� ���ɼ� ����, try catch�� ������� ��
			out.write(7);
//			out.close(); // fianally ���� ���� �� ������ �Űܵ� ��. �̷� ��� thorws �����ؾ� ��
			System.out.println("���� ���� ����");
		} catch (IOException e) {
//			e.printStackTrace();	//Ư�� ȭ�� ������ �ϴ� ��
			e.getMessage();		//Ư�� �޽��� ����
//			System.out.println("");
		}finally {
			if(out!=null) {
				out.close();
			}
		}
		
	}
}
