package passionjava020;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice {
	
	List<String> list=new ArrayList<>();
	public void ToyShop() {
		list.add("�κ�");
		list.add("����");
		list.add("�̴�ī");
		list.add("����");
		list.add("�����");
		list.add("����");
		list.add("�������");
		list.add("ī��");
	}
		
	List<Integer> price=new ArrayList<>();
	public void Num() {
		price.add(20000);
		price.add(15000);
		price.add(75000);
		price.add(60000);
		price.add(18000);
		price.add(23000);
		price.add(10000);
	}
	
	Iterator<String> it=list.iterator();
	Iterator<Integer> tor=price.iterator();
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		List<Integer> price=new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
//		Practice toy=new Practice();
//		Practice pr=new Practice();
//		toy.ToyShop();
//		pr.Num();
		
		
		
		System.out.println();
		
		
			
		
	}
}

