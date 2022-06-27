package chapter32;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {
	public static void main(String[] args) {
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("ex.txt"));){
			bw.write("�ȳ��ϼ���111");
			System.out.println("���� ���� ����");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedReader br=new BufferedReader(new FileReader("ex.txt"))){
			String str=br.readLine();	//���ۿ� ����� ���̸�ŭ �о� ���� ��
			System.out.println(str);	
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
