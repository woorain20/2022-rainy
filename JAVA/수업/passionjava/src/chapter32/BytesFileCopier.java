package chapter32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BytesFileCopier {
	public static void main(String[] args) {
		//버퍼 - 파일 입출력 할 때 사용
		//ctrl+shift+o = 자동 import 
		//버퍼 없음
		//버퍼 - 잠시 일정한 단위로 임시 저장
		//스트림 = 메모리 -> 하드디스크
		//스트림: 지속적으로 입출력이 일어 나는 것
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
