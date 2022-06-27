package passionjava014;

public class OnlyClassNoInstance {
	public static void main(String[] args) {
		InstCnt2.instNum2-=15;	//인스턴스 생성없이 instNum에 접근
		System.out.println(InstCnt2.instNum2);
	}
}
