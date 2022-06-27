package Quest;

public class introduction1 {
	private String name;
 	private String age;
 	private String adress;
 	private String hobby;
 	private String assNumber;

	public void Setname(String name) {
		this.name=name;
	}
	public void Setage(String age) {
		this.age=age;
	}
	public void Setadress(String adress) {
		this.adress=adress;
		
	}
	public void Sethobby(String hobby) {
		this.hobby=hobby;
	}
	public void	Setassnumber(String assnumber) {
		this.assNumber=assnumber;
	}
	public void introduction() {
		System.out.println("이름:"+ name);
		System.out.println("나이:"+ age);
		System.out.println("주소:"+ adress);
		System.out.println("취미:"+ hobby);
		System.out.println("생년월일:"+ assNumber);
		
	}
	public void me () {
		System.out.println("나 자신을 소개합니다.");
	}
	public static void main(String[] args) {
		introduction1 introduction= new introduction1();
		introduction.Setname ("조재천");
		introduction.Setage ("29");
		introduction.Setadress ("경상북도 충효 대우아파트");
		introduction.Sethobby ("그림");
		introduction.Setassnumber("1994 01 31");
		introduction.introduction ();
		introduction.me ();
		
		
	}
	}
