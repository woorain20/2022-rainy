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
		System.out.println("대상 파일: ");
		String str=sc.nextLine();
		
		System.out.println("사본 이름: ");
		String dstr=sc.nextLine();
		
		try(InputStream in=new FileInputStream(str);
			OutputStream out=new FileOutputStream(dstr)){
			byte buf[]=new byte[1024];
			int len;
			
			while(true) {
				len=in.read(buf); 	//배열 buf로 데이터를 읽어 들이고,
				if(len==-1) { 		//더 이상 읽어 들일 데이터가 없다면,
					break;
				}
				out.write(buf,0,len); 	//len바이트만큼 데이터를 저장한다.
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
