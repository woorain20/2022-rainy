package passionjava022;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutout {
	public static void main(String[] args) {
		SBox box1=new SBox("Robot");
		SBox box2=new SBox("Strawberry");
		
		try(ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("Object.bin"))){
			oo.writeObject(box1); 	//box1�� �����ϴ� �ν��Ͻ� ����
			oo.writeObject(box2); 	//box2�� �����ϴ� �ν��Ͻ� ����
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

