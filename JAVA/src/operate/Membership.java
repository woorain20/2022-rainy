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
		
		System.out.println("회원 정보");
		System.out.println("===============");
		System.out.println("회원명: "+name);
		System.out.println("연락처: "+phone);
		System.out.println("성별: "+gender);
		System.out.println("연령: "+age);
		System.out.println("이용상품: "+room);
		System.out.println("종료일: ~ "+date);
	}
}
