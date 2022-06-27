package passionjava022;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedStreamFileCopier {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("��� ����: ");
		String str=sc.nextLine();
		
		System.out.println("�纻 �̸�: ");
		String dstr=sc.nextLine();
		
		try(BufferedInputStream in=new BufferedInputStream(new FileInputStream(str));
			BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(dstr))){
				int data;
				while(true) {
					data=in.read();
					if(data==-1) {
						break;
					}
					out.write(data);
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
			
	}

}
