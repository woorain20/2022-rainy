package passionjava020;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();	//�÷��� �ν��Ͻ� ����
		
		//�÷��� �ν��Ͻ��� ���ڿ� �ν��Ͻ� ����
		list.add("Henry");
		list.add("Wenger");
		list.add("Vieira");
		list.add("Arteta");
		list.add("Van Persei");
		list.add("White");
		list.add("Saka");
		list.add("Smith-Low");
		
		//����� ���ڿ� �ν��Ͻ��� ����
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(4);	// ù��° �ν��Ͻ� ����
		
		System.out.println("\n"+"Remove");
		//ù ��° �ν��Ͻ� ���� �� ������ �ν��Ͻ����� ����
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}

}
