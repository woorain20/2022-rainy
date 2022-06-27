package passionjava014;

public class ClassVarAccess {
	public static void main(String[] args) {
		AccessWay way=new AccessWay();
		way.num++;	//외부에서 인스턴스의 이름을 통한 접근
		AccessWay.num++;	//외부에서 클래스의 이름을 통한 접근
		System.out.println("num= "+AccessWay.num);
	}
}
