package chapter11;

public class ConOverloading2 {
	
	public static void main(String[] args) {
		Person2 Kim=new Person2(991453, 157965);
		Person2 Lee=new Person2(123553, 0);
		Person2 Park=new Person2(4156453, 0);
		Person2 Jung=new Person2(0021453, 11635);
		
		Kim.showPersonalInfo();
		Lee.showPersonalInfo();
		Park.showPersonalInfo();
		Jung.showPersonalInfo();
	}

}
