package passionjava016;

public class EnhancedForInst2 {
	public static void main(String[] args) {
		
		Box3[]ar=new Box3[5];
		ar[0]=new Box3(201, "미시경제학");
		ar[1]=new Box3(204, "산업조직론");
		ar[2]=new Box3(302, "거시경제학");
		ar[3]=new Box3(117, "회계학원론");
		ar[4]=new Box3(306, "계량경제학");
		
		for(Box3 e: ar) {
			if(e.getNumber()==302) {
				System.out.println(e);
			}
		}
	}

}
