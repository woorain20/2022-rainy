package chapter15;

public class YummyCakeOverriding {
	public static void main(String[] args) {
		CheeseCake cheeseCake=new CheeseCake();
		cheeseCake.yummy();
		Cake cheeseCake4=new CheeseCake();	//상속관계에 있으면 상위클래스로 하위 인스턴스를 담는 것은 가능
//		CheeseCake cake=new Cake();		//하위클래스로 상위 인스턴스는 담을 수 업다
		
		Cake cake1=new Cake();
		Cake cake2=new Cake();
		Cake cake3=new Cake();
		Cake cheeseCake1=new CheeseCake();
		Cake cheeseCake2=new CheeseCake();
		Cake cheeseCake3=new CheeseCake();
		Cake strawberryCheeseCake1=new StrawberryCheeseCake();
		Cake strawberryCheeseCake2=new StrawberryCheeseCake();
		Cake strawberryCheeseCake3=new StrawberryCheeseCake();
		Cake[]cakeArr=new Cake[12];
		cakeArr[0]=cake1;
		cakeArr[1]=cake2;
		cakeArr[2]=cake3;
		cakeArr[3]=cheeseCake1;
		cakeArr[4]=cheeseCake2;
		cakeArr[5]=cheeseCake3;
		cakeArr[6]=strawberryCheeseCake1;
		cakeArr[7]=strawberryCheeseCake2;
		cakeArr[8]=strawberryCheeseCake3;
		cakeArr[9]=new BananaCake();
		cakeArr[10]=new BananaCake();
		cakeArr[11]=new BananaCake();
		//메소드 오버라이딩 - 다형성 - 코드의 양이 줄어듬 - 유지보수와 확장성이 좋아짐
		for(int i=0;i<cakeArr.length;i++) {
			cakeArr[i].yummy();
		}
		}

}
