package passionjava022;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class BytesFileCopier {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��� ����: ");
		String str=sc.nextLine();
		
		System.out.println("�纻 �̸�: ");
		String dstr=sc.nextLine();
		
		try(InputStream in=new FileInputStream(str);
			OutputStream out=new FileOutputStream(dstr)){
			int data;
			while(true) {
				data=in.read(); 	//���Ϸκ��� 1����Ʈ�� �д´�.
				if(data==-1) { 		//�� �̻� �о� ���� �����Ͱ� ���ٸ�,
					break;
				}
				out.write(data); 	//���Ͽ� 1����Ʈ�� ����.
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
