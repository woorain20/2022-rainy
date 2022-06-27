package traineephonebook;

//훈련생-인스턴스
//여러 훈련생-어레이리스트
public class Trainee {
	private String tName;
	private String tPhone;
	
	public Trainee() {	//오버로딩용
		
	}
	
	//생성자
	public Trainee(String tName, String tPhone) {
		super();
		this.tName = tName;
		this.tPhone = tPhone;
	}
	
	//세터
	public void setName(String tName) {
		this.tName=tName;
	}
	
	public void setPhone(String tPhone) {
		this.tPhone = tPhone;
	}
	
	//게터
	public String getName() {
		return tName;
	}
	public String getPhone() {
		return tPhone;
	}
	
	@Override
	public String toString() {
		return "Trainee [tName=" + tName + ", tPhone=" + tPhone + "]";
	}
	
	public static void main(String[] args) {
		//한사람 이름-김자바 폰번호 010-1234-5678
		Trainee trainee=new Trainee("김자바", "010-1234-5678");
		//메소드(세터게터)
		//한사람 이름-김클립스 폰번호 010-9876-5432
		Trainee trainee2=new Trainee();
		trainee2.setName("김클립스");
		trainee2.setPhone("010-9876-5432");
		
		System.out.println(trainee.toString());
		System.out.println(trainee2.toString());
		
		System.out.println(trainee.getName());
		System.out.println(trainee2.getPhone());
		//리스트
		
	}


}
