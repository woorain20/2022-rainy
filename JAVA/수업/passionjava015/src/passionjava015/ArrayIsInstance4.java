package passionjava015;

public class ArrayIsInstance4 {
	
	public static void main(String[] args) {
		
		int ar[]=new int[8];
		String as[]=new String[4];
		double ad[]=new double[5];
		
		ar[0]=1000;
		ar[1]=500;
		ar[2]=2500;
		ar[3]=3000;
		ar[4]=700;
		ar[5]=1400;
		ar[6]=2000;
		ar[7]=ar[1]*ar[4];
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println(ar[4]);
		System.out.println(ar[5]);
		System.out.println(ar[6]);
		System.out.println(ar[7]);
		
		as[0]="교통비";
		as[1]="문화생활비";
		as[2]="식비";
		as[3]="통신비";
		
		System.out.println(as[0]);
		System.out.println(as[1]);
		System.out.println(as[2]);
		System.out.println(as[3]);
		
		ad[0]=22.4;
		ad[1]=17.6;
		ad[2]=30.8;
		ad[3]=5.7;
		ad[4]=10.9;
		
		System.out.println(ad[0]+"%");
		System.out.println(ad[1]+"%");
		System.out.println(ad[2]+"%");
		System.out.println(ad[3]+"%");
		System.out.println(ad[4]+"%");
		
		System.out.println(as[1]+" "+ar[5]+" "+ad[3]+"%");
		System.out.println(as[3]+" "+ar[4]+" "+ad[2]+"%");
		System.out.println(as[2]+" "+ar[6]+" "+ad[4]+"%");
	}

}
