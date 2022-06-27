package passionjava020;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();	//컬렉션 인스턴스 생성
		
		//컬렉션 인스턴스에 문자열 인스턴스 저장
		list.add("Henry");
		list.add("Wenger");
		list.add("Vieira");
		list.add("Arteta");
		list.add("Van Persei");
		list.add("White");
		list.add("Saka");
		list.add("Smith-Low");
		
		//저장된 문자열 인스턴스의 참조
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(4);	// 첫번째 인스턴스 삭제
		
		System.out.println("\n"+"Remove");
		//첫 번째 인스턴스 삭제 후 나머지 인스턴스들을 참조
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
