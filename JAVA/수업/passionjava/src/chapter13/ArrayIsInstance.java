package chapter13;

public class ArrayIsInstance {
	
	public static void main(String[] args) {
		//길이가 5인 int형 배열의 생성
		int[] ar1=new int[5];
		String[] as1=new String[10];
		
		//배열의 길이를 반환해주는 변수:length
		System.out.println(ar1.length);
		System.out.println(as1.length);
		
		//[인덱스값(index)]
		ar1[0]=7;
		ar1[1]=8;
		ar1[2]=9;
		ar1[3]=10;
		ar1[4]=11;
		ar1[0]=77;
		ar1[1]=ar1[4];
		System.out.println(ar1[0]);
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		System.out.println(ar1[3]);
		System.out.println(ar1[4]);
		for(int i=0;i<ar1.length;i++) {
			System.out.println(ar1[i]);
		}
	}

}
