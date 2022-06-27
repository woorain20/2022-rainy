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
		System.out.println("가장 좋아하는 것");
		System.out.println("이름: "+name);
		System.out.println("음식: "+food);
		System.out.println("동물: "+animal);
		System.out.println("나라: "+country);
	}
	public static void main(String[] args) {
		Homework_220413 MyFavorite=new Homework_220413();
		MyFavorite.setName("John");
		MyFavorite.setFood("피자");
		MyFavorite.setAnimal("호랑이");
		MyFavorite.setCountry("한국");
		MyFavorite.printFavorite();
		
		Homework_220413 MyFavorite2=new Homework_220413();
		MyFavorite2.setName("Stella");
		MyFavorite2.setFood("감자튀김");
		MyFavorite2.setAnimal("토끼");
		MyFavorite2.setCountry("그리스");
		MyFavorite2.printFavorite();
	}
}
