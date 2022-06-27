package passionjava015;

public class Person {
	private String name;
	private String section;
	private int salary;
	private int howLong;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getHowLong() {
		return howLong;
	}
	public void setHowLong(int howLong) {
		this.howLong = howLong;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", section=" + section + ", salary=" + salary + ", howLong=" + howLong + "]";
	}

	public static void main(String[] args) {
		Person[] per=new Person[50];
		Person per1=new Person();
		per1.setName("Jackson");
		per1.setSection("Financial");
		per1.setSalary(3300);
		per1.setHowLong(14);
		per[0]=per1;
		System.out.println(per[0].toString());
		
		for(int i=0;i<per.length;i++) {
			Person person=new Person();
			person.setName("Jackson"+i);
			person.setSection("Financial"+i);
			person.setSalary(3300+i);
			person.setHowLong(14+i);
			per[i]=person;
		}
		int salaryMean=0;
		for(int i=0;i<per.length;i++) {
			salaryMean+=per[i].getSalary();
		}
		salaryMean=salaryMean/per.length;
		System.out.println(salaryMean);
		
		int howLongMean=0;
		for(int j=0;j<per.length;j++) {
			howLongMean+=per[j].getHowLong();
		}
		howLongMean=howLongMean/per.length;
		System.out.println(howLongMean);
	}
}
