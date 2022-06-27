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
		
		Iterator<String> itr=list.iterator();	//�ݺ��� ó�� ȹ��
		
		//�ݺ��ڸ� �̿��� ������ ����
		while(itr.hasNext()) {
			System.out.println(itr.next()+"\n");
		}
		
		itr=list.iterator();	//�ݺ��� �ٽ� ȹ��
		
		//��� "Art" ����
		String str;
		while(itr.hasNext()) {
			str=itr.next();
			if(str.equals("Art")) {
				itr.remove();
			}
		}
		
		itr=list.iterator();	//�ݺ��� �ٽ� ȹ��
		
		//���� �� ��� Ȯ��
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
