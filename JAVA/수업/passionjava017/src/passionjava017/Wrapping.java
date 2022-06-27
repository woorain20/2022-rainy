package passionjava017;

public class Wrapping {
	public static void main(String[] args) {
		Box box1=new Box();
		PaperBox box2=new PaperBox();
		GoldPaperBox box3=new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
	
	public static void wrapBox(Box box) {
		if(box instanceof GoldPaperBox) {
			((GoldPaperBox)box).goldWrap(); 	//형 변환 후 메소드 호출
		}else if(box instanceof PaperBox) {
			((PaperBox)box).paperWrap(); 		//형 변환 후 메소드 호출
		}else {
			box.simpleWrap();
		}
	}
}
