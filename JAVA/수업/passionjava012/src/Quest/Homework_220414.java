package Quest;

public class Homework_220414 {

	private String name;
	private String food;
	private String animal;
	private String country;
	
	public Homework_220414(String n, String f, String a, String c) {
		name=n;
		food=f;
		animal=a;
		country=c;
	}
	
	public void printFavorite() {
		System.out.println("���� �����ϴ� ��");
		System.out.println("�̸�: "+name);
		System.out.println("����: "+food);
		System.out.println("����: "+animal);
		System.out.println("����: "+country+'\n');
	}
	public static void main(String[] args) {
		Homework_220414 myFavorite=new Homework_220414("John", "����", "ȣ����", "�ѱ�");
		Homework_220414 myFavorite2=new Homework_220414("Stella", "����Ƣ��", "�䳢", "�׸���");
		
		myFavorite.printFavorite();
		myFavorite2.printFavorite();
	}
		
}
