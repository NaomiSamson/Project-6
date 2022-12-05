package bevshop;

public class Customer {
	
	private String name;
	private int age;
	
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		
		String alcoholData = name+" "+age;
		return alcoholData;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
