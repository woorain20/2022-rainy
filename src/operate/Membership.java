package operate;

import dto.StudyVO;

public class Membership {
	
	public void member(StudyVO svo) {
		String name=svo.getName();
		String phone=svo.getPhone();
		boolean gender=svo.isGender();
		int age=svo.getAge();
		int room=svo.getRoom();
		int date=svo.getDate();
		
		System.out.println("ȸ�� ����");
		System.out.println("===============");
		System.out.println("ȸ����: "+name);
		System.out.println("����ó: "+phone);
		System.out.println("����: "+gender);
		System.out.println("����: "+age);
		System.out.println("�̿��ǰ: "+room);
		System.out.println("������: ~ "+date);
	}
}
