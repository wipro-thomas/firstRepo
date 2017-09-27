package practice;

public class Person {
	
	String name;
	double age;
	String national;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getNational() {
		return national;
	}

	public void setNational(String national) {
		this.national = national;
	}

	
	
	public Person(String name, double age, String national) {
		super();
		this.name = name;
		this.age = age;
		this.national = national;
	}
	

}
