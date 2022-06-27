package passionjava014;

public class AccessWay {
	static int num=0;
	
	AccessWay(){
		incrCnt();
	}
	void incrCnt() {
		num++;	//클래스 내부에서 이름을 통한 접근
	}
}
