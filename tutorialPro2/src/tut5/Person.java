package tut5;

public class Person { //blueprint
	private String name; //attributes
	
	public Person(String aName) { //constructor
		name = aName;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String newName) { //method
		name = newName;
	}
	
	public void greet() { //method
		System.out.printf("Hello, my name is %s%n", name);
	}
}
