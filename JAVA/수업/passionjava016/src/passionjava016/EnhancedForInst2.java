package passionjava016;

public class EnhancedForInst2 {
	public static void main(String[] args) {
		
		Box3[]ar=new Box3[5];
		ar[0]=new Box3(201, "�̽ð�����");
		ar[1]=new Box3(204, "���������");
		ar[2]=new Box3(302, "�Žð�����");
		ar[3]=new Box3(117, "ȸ���п���");
		ar[4]=new Box3(306, "�跮������");
		
		for(Box3 e: ar) {
			if(e.getNumber()==302) {
				System.out.println(e);
			}
		}
	}

}
