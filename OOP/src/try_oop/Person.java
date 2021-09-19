package try_oop;

public class Person {
	public String name;
	public String address;
	public int age;
	
	Person(String name, String address, int age)
	{
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public void displayPerson()
	{
		System.out.println("Person Name : "+this.name);
		System.out.println("Person address : "+this.address);
		System.out.println("Person Age : "+this.age);
	}
	
	
}
