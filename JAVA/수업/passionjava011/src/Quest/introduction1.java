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
		System.out.println("�̸�:"+ name);
		System.out.println("����:"+ age);
		System.out.println("�ּ�:"+ adress);
		System.out.println("���:"+ hobby);
		System.out.println("�������:"+ assNumber);
		
	}
	public void me () {
		System.out.println("�� �ڽ��� �Ұ��մϴ�.");
	}
	public static void main(String[] args) {
		introduction1 introduction= new introduction1();
		introduction.Setname ("����õ");
		introduction.Setage ("29");
		introduction.Setadress ("���ϵ� ��ȿ ������Ʈ");
		introduction.Sethobby ("�׸�");
		introduction.Setassnumber("1994 01 31");
		introduction.introduction ();
		introduction.me ();
		
		
	}
	}
