package Quest;

public class Homework_220413 {
	
	private String name;
	private String food;
	private String animal;
	private String country;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setFood(String food) {
		this.food=food;
	}
	public void setAnimal(String animal) {
		this.animal=animal;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public void printFavorite() {
		System.out.println("���� �����ϴ� ��");
		System.out.println("�̸�: "+name);
		System.out.println("����: "+food);
		System.out.println("����: "+animal);
		System.out.println("����: "+country);
	}
	public static void main(String[] args) {
		Homework_220413 MyFavorite=new Homework_220413();
		MyFavorite.setName("John");
		MyFavorite.setFood("����");
		MyFavorite.setAnimal("ȣ����");
		MyFavorite.setCountry("�ѱ�");
		MyFavorite.printFavorite();
		
		Homework_220413 MyFavorite2=new Homework_220413();
		MyFavorite2.setName("Stella");
		MyFavorite2.setFood("����Ƣ��");
		MyFavorite2.setAnimal("�䳢");
		MyFavorite2.setCountry("�׸���");
		MyFavorite2.printFavorite();
	}
}
