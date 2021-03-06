package passionjava022;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutout {
	public static void main(String[] args) {
		SBox box1=new SBox("Robot");
		SBox box2=new SBox("Strawberry");
		
		try(ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("Object.bin"))){
			oo.writeObject(box1); 	//box1이 참조하는 인스턴스 저장
			oo.writeObject(box2); 	//box2이 참조하는 인스턴스 저장
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

