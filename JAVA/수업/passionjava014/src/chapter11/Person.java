package chapter11;

public class Person {
	private int regiNum;	//주민번호 등록
	private int passNum;	//여권번호 등록
	
	public Person(int rnum, int pnum){
		regiNum=rnum;
		passNum=pnum;
	}
	
	public Person(int rnum){
		regiNum=rnum;
		passNum=0;
	}
	
	public void showPersonalInfo() {
		System.out.println("주민등록번호: "+regiNum);
		if(passNum!=0) {
			System.out.println("여권번호: "+passNum+'\n');
		}else {
			System.out.println("여권을 가지고 있지 않습니다.\n");
		}
	}
}
