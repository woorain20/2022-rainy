package passionjava020;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorCollection {
	public static void main(String[] args) {
		List<String> list=new LinkedList<>();
		list.add("Book");
		list.add("Movie");
		list.add("Art");
		list.add("Music");
		list.add("Perfomence");
		
		Iterator<String> itr=list.iterator();	//반복자 처음 획득
		
		//반복자를 이용한 순차적 참조
		while(itr.hasNext()) {
			System.out.println(itr.next()+"\n");
		}
		
		itr=list.iterator();	//반복자 다시 획득
		
		//모든 "Art" 삭제
		String str;
		while(itr.hasNext()) {
			str=itr.next();
			if(str.equals("Art")) {
				itr.remove();
			}
		}
		
		itr=list.iterator();	//반복자 다시 획득
		
		//삭제 후 결과 확인
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
