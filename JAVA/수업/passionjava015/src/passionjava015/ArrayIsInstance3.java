package passionjava015;

public class ArrayIsInstance3 {
	
	public static void main(String[] args) {
		
		int ar[]=new int [8];
		String as[]=new String [12];
		
		System.out.println(ar.length);
		System.out.println(as.length);
		
		ar[0]=11;
		ar[1]=8;
		ar[2]=15;
		ar[3]=9;
		ar[4]=21;
		ar[5]=30;
		ar[6]=4;
		ar[7]=ar[2]+ar[4];
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		System.out.println(ar[5]);
		System.out.println(ar[6]);
		System.out.println(ar[7]);
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

}
