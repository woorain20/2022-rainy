package Quest;

public class Account {

	private String name;
	private int age;
	private double height;

	public void SetName(String name) {
		this.name = name;
	}

	public void SetAge(int age) {
		this.age = age;
	}

	public void SetHeight(Double height) {
		this.height = height;
	}

	public void PrintAccount() {
		System.out.println("NAME   : " + name);
		System.out.println("AGE    : " + age);
		System.out.printf("%s%.2f%s", "HEIGHT : ", height, " cm");
		System.out.println("\n");
	}

	public static void main(String[] args) {
		Account a = new Account();
		a.SetName("agh");
		a.SetAge(2);
		a.SetHeight(125.36);

		a.PrintAccount();

		Account b = new Account();
		b.SetName("ashe");
		b.SetAge(25);
		b.SetHeight(1223.3667);

		b.PrintAccount();
	}

}
