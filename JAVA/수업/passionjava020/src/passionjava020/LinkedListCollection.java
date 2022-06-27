package passionjava020;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {
	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();	//유일한 변화
		list.add("Ship");
		list.add("Car");
		list.add("Train");
		list.add("Subway");
		list.add("Airplain");
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		list.remove(3);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
