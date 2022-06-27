package passionjava022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Practice {
	public static void main(String[] args) {
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("cake.txt"))){
			bw.write("Cheese Cake"+"\t");
			bw.write("5000");
			bw.newLine();
			bw.write("Chocolate Cake"+"\t");
			bw.write("6000");
			System.out.println("파일 쓰기 성공");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedReader br=new BufferedReader(new FileReader("cake.txt"))){
			String str=br.readLine();
			System.out.println(str);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
