package chapter11;

public class SchoolClass {
	private int roomNum;
	private int student;
	private String teacher;
	
	public SchoolClass(int rnum, String tea, int stu) {
		this.roomNum=rnum;
		this.teacher=tea;
		this.student=stu;
	}
	
	public void showClassInfo() {
		System.out.println("강의실: "+roomNum);
		System.out.println("교수: "+teacher);
		if(student<15) {
			System.out.println("수강인원: "+student+"\n수강인원 미달로 폐강\n");
		}else {
			System.out.println("수강인원: "+student+'\n');
		}
	}
	public static void main(String[] args) {
		SchoolClass sc=new SchoolClass(206, "Tom", 18);
		SchoolClass sc2=new SchoolClass(304, "Harry", 16);
		SchoolClass sc3=new SchoolClass(502, "Kevin", 13);
		SchoolClass sc4=new SchoolClass(405, "Jack", 32);
		
		sc.showClassInfo();
		sc2.showClassInfo();
		sc3.showClassInfo();
		sc4.showClassInfo();
	}

}
