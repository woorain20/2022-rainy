package passionjava020;

import java.util.LinkedList;
import java.util.List;

public class EnhancedForCollection {
	public static void main(String[] args) {
		List<String> list=new LinkedList<>();
		
		//�ν��Ͻ� ����
		list.add("Energy");
		list.add("Game");
		list.add("Ball");
		list.add("Sign");
		
		//��ü �ν��Ͻ� ����
		for(String s:list) {
			System.out.println(s);
		}
		
		System.out.println();
		
		list.remove(0);	//ù ��° �ν��Ͻ� ����
		
		//��ü �ν��Ͻ� ����
		for(String s:list) {
			System.out.println(s);
		}
	}
}
