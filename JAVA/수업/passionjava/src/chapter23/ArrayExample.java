package chapter23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayExample {
	public static void main(String[] args) {
		//�÷��� ����
		//<>-���׸�-������ ������ Ÿ���� ����
		//�⺻������ Ÿ��(x),���� Ŭ����
		ArrayList<Integer> intlist=new ArrayList<>();
		String[] strArr=new String[20];
		//Vector �ڹ� 1.3v �������� ���. ������ ������
		//�÷����� ���� ���� ��ŭ �ڵ����� ������ �þ��� �پ��� �Ѵ�
		//�ڹٿ����� ��ǻ� �迭(x) �÷��Ǹ� ����
		List<String> strList1=new ArrayList<>();	//List=interface, ArrayList=class
		ArrayList<String> strList=new ArrayList<>();	//���� <>�� ���� <>�� �ִ� ������ Ÿ���� �Է��ص� ������ �����ϴ� ���� ��κ�
		
		//����
		strList.add("Toy");
		String box="Box";
		strList.add("Box");
		strList.add(new String("Robot"));
		strList.add("Doll");		
		strList.add("Toy");
		System.out.println(strList.size());
		
		//����-���
		for(int i=0;i<strList.size();i++) {
			System.out.println(strList.get(i));	
		}
		
		//����
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
		//���ͷ����� ��� - �ݺ���
		Iterator<String> itr=strList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
