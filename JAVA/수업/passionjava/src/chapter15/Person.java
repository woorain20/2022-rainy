package chapter15;

/*Value Object VO클래스
 * Date transfer Object DTO클래스
 */
public class Person { //extends Object가 생략되어 있음
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

	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] args) {
		Person[] persons=new Person[100];
		Person person=new Person();
		person.setName("김자바");
		person.setSalary(2800);
		persons[0]=person;
		System.out.println(persons[0].toString());
		
		for(int i=0;i<persons.length;i++) {
			Person person1=new Person();
			person1.setName("김자바"+i);
			person1.setSalary(2800+i);
			persons[i]=person1;
		}
		int salaryMean=0;
		for(int i=0; i<persons.length; i++) {
			salaryMean+=persons[i].getSalary();
		}
		salaryMean=salaryMean/persons.length;
		System.out.println("연봉평균: "+salaryMean);
	}

}
