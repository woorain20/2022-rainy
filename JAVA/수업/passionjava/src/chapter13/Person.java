package chapter13;

public class Person {
	private String name;
	private int salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		Person[] persons=new Person[100];
		Person person=new Person();
		person.setName("±èÀÚ¹Ù");
		person.setSalary(2800);
		persons[0]=person;
		System.out.println(persons[0].toString());
		
		for(int i=0;i<persons.length;i++) {
			Person person1=new Person();
			person1.setName("±èÀÚ¹Ù"+i);
			person1.setSalary(2800+i);
			persons[i]=person1;
		}
		int salaryMean=0;
		for(int i=0; i<persons.length; i++) {
			salaryMean+=persons[i].getSalary();
		}
		salaryMean=salaryMean/persons.length;
		System.out.println("¿¬ºÀÆò±Õ: "+salaryMean);
	}

}
