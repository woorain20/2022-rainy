package passionjava01801;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase5 {
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		
		try {
			System.out.println("a/b...a?");
			int n1=kb.nextInt();
			System.out.println("a/b...b?");
			int n2=kb.nextInt();
			System.out.println(n1+"/"+n2+"="+n1/n2);
		}catch(InputMismatchException e){
			e.getMessage();
		}
		
		System.out.println("good bye");
	}

}
