package passionjava020;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorCollection2 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Book");
		list.add("Movie");
		list.add("Art");
		list.add("Music");
		list.add("Perfomence");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		list.remove(2);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
