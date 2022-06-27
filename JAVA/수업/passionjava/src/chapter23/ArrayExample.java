package chapter23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayExample {
	public static void main(String[] args) {
		//컬렉션 생성
		//<>-제네릭-저장할 데이터 타입을 넣음
		//기본데이터 타입(x),래퍼 클래스
		ArrayList<Integer> intlist=new ArrayList<>();
		String[] strArr=new String[20];
		//Vector 자바 1.3v 이전에서 사용. 지금은 사용안함
		//컬렉션은 저장 길이 만큼 자동으로 공간이 늘었다 줄었다 한다
		//자바에서는 사실상 배열(x) 컬렉션만 쓴다
		List<String> strList1=new ArrayList<>();	//List=interface, ArrayList=class
		ArrayList<String> strList=new ArrayList<>();	//뒤의 <>에 앞의 <>에 있는 데이터 타입을 입력해도 되지만 생략하는 것이 대부분
		
		//저장
		strList.add("Toy");
		String box="Box";
		strList.add("Box");
		strList.add(new String("Robot"));
		strList.add("Doll");		
		strList.add("Toy");
		System.out.println(strList.size());
		
		//참조-출력
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i));	
		}
		
		//삭제
		strList.remove(4);
//		strList.remove(0);
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i));	
		}
		
		System.out.println("foreach");
		for(String s:strList) {
			System.out.println(s);
		}
		
		System.out.println("iterator");
		//이터레이터 사용 - 반복자
		Iterator<String> itr=strList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
