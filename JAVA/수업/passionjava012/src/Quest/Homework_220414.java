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
		System.out.println("가장 좋아하는 것");
		System.out.println("이름: "+name);
		System.out.println("음식: "+food);
		System.out.println("동물: "+animal);
		System.out.println("나라: "+country+'\n');
	}
	public static void main(String[] args) {
		Homework_220414 myFavorite=new Homework_220414("John", "피자", "호랑이", "한국");
		Homework_220414 myFavorite2=new Homework_220414("Stella", "감자튀김", "토끼", "그리스");
		
		myFavorite.printFavorite();
		myFavorite2.printFavorite();
	}
		
}
