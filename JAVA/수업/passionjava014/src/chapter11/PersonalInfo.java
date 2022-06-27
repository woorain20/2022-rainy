package chapter11;

public class PersonalInfo {
	
	
	public static void main(String[] args) {
		
		String born="891211-1";
		String born2="940428-2";
		String born3="961005-1";
		String born4="980913-1";
		String born5="051017-3";
		String born6="080831-4";
		int curYear=2022;
		
		String s1=born.substring(0, 2);
		int bornYear=Integer.parseInt(s1);
		if(bornYear>50) {
			String s11="19".concat(s1);
			System.out.println("생년: "+s11);
			int age=curYear-Integer.parseInt(s11);
			System.out.println("나이: "+age);
		}else {
			String s11="20".concat(s1);
			System.out.println("생년: "+s11);
			int age=curYear-Integer.parseInt(s11);
			System.out.println("나이: "+age);
		}
		
		String gen=born.substring(7);
		int gender=Integer.parseInt(gen);
		if(gender==1) {
			System.out.println("성별: "+"남");
		}else if(gender==3) {
			System.out.println("성별: "+"남");
		}else {
			System.out.println("성별: "+"여");
		}
		
		String s2=born2.substring(0, 2);
		int bornYear2=Integer.parseInt(s2);
		if(bornYear2>50) {
			String s21="19".concat(s2);
			System.out.println("생년: "+s21);
			int age=curYear-Integer.parseInt(s21);
			System.out.println("나이: "+age);
		}else {
			String s21="20".concat(s2);
			System.out.println("생년: "+s21);
			int age=curYear-Integer.parseInt(s21);
			System.out.println("나이: "+age);
		}
		
		String gen2=born2.substring(7);
		int gender2=Integer.parseInt(gen2);
		if(gender2==1) {
			System.out.println("성별: "+"남");
		}else if(gender2==3) {
			System.out.println("성별: "+"남");
		}else {
			System.out.println("성별: "+"여");
		}
		
		String s3=born3.substring(0, 2);
		int bornYear3=Integer.parseInt(s3);
		if(bornYear3>50) {
			String s31="19".concat(s3);
			System.out.println("생년: "+s31);
			int age=curYear-Integer.parseInt(s31);
			System.out.println("나이: "+age);
		}else {
			String s31="20".concat(s3);
			System.out.println("생년: "+s31);
			int age=curYear-Integer.parseInt(s31);
			System.out.println("나이: "+age);
		}
		
		String gen3=born3.substring(7);
		int gender3=Integer.parseInt(gen3);
		if(gender3==1) {
			System.out.println("성별: "+"남");
		}else if(gender3==3) {
			System.out.println("성별: "+"남");
		}else {
			System.out.println("성별: "+"여");
		}
		

	}

}
