package chapter11;

public class Person2 {

	private int regiNum;
	private int passNum;
	
	public Person2(int rnum, int pnum){
		regiNum=rnum;
		passNum=pnum;
	}
	
	public Person2(int rnum){
		regiNum=rnum;
		passNum=0;
	}
	public void showPersonalInfo() {
		System.out.println("주민번호: "+regiNum);
		if(passNum!=0) {
			System.out.println("여권번호: "+passNum+'\n');
		}else {
			System.out.println("여권을 가지고 있지 않습니다.\n");
		}
	}
}
