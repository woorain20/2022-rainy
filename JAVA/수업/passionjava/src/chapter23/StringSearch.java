package chapter23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSearch {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Box");
		list.add("Robot");
		list.add("Apple");
		list.add("Ship");
		list.add("Goal");		
		Collections.sort(list);	//오름차순
		for(String s:list) {
			System.out.println(s);
		}
		int idx=Collections.binarySearch(list, "Robot");
		System.out.println("Index: "+idx);
		System.out.println("String: "+list.get(idx));
	}

}
