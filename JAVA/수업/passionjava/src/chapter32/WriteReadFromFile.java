package chapter32;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteReadFromFile {
	public static void main(String[] args) throws IOException{
		OutputStream out=null;
		try {
			out=new FileOutputStream("data.dat");	//파일 관련은 오류 발생 가능성 높음, try catch로 감싸줘야 함
			out.write(7);
//			out.close(); // fianally 안의 것을 이 쪽으로 옮겨도 됨. 이럴 경우 thorws 삭제해야 함
			System.out.println("파일 쓰기 성공");
		} catch (IOException e) {
//			e.printStackTrace();	//특정 화면 나오게 하는 것
			e.getMessage();		//특정 메시지 띄우기
//			System.out.println("");
		}finally {
			if(out!=null) {
				out.close();
			}
		}
		
	}
}
