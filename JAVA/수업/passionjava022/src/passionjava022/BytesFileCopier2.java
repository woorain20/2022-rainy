package passionjava022;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class BytesFileCopier2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��� ����: ");
		String str=sc.nextLine();
		
		System.out.println("�纻 �̸�: ");
		String dstr=sc.nextLine();
		
		try(InputStream in=new FileInputStream(str);
			OutputStream out=new FileOutputStream(dstr)){
			byte buf[]=new byte[1024];
			int len;
			
			while(true) {
				len=in.read(buf); 	//�迭 buf�� �����͸� �о� ���̰�,
				if(len==-1) { 		//�� �̻� �о� ���� �����Ͱ� ���ٸ�,
					break;
				}
				out.write(buf,0,len); 	//len����Ʈ��ŭ �����͸� �����Ѵ�.
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
