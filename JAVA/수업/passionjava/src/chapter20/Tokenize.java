package chapter20;

import java.util.StringTokenizer;

public class Tokenize {
	public static void main(String[] args) {
		String time1="PM:08:45";
		
		String[] sa1=new String[3];
		
		//split()
		StringTokenizer st1=new StringTokenizer(time1,":");
		while(st1.hasMoreTokens()) {
			System.out.print(st1.nextToken()+" ");
		}
		
		StringTokenizer st2=new StringTokenizer(time1,":");
		int cnt=0;
		while(st2.hasMoreElements()) {
			sa1[cnt++]=st2.nextToken();
		}
		System.out.println(sa1[0]);
		System.out.println(sa1[1]);
		System.out.println(sa1[2]);
	}

}
