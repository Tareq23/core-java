package try_oop;

public class Student extends Person{
	
	public String deptName;
	public String currentSemester;
	
	public Student(String name,String address, int age, String deptName, String currentSemester)
	{
		super(name,address,age); // parent class constructor called
		this.deptName = deptName;
		this.currentSemester = currentSemester;
	}
	
	public void displayStudentInfo()
	{
		System.out.println("Student name : "+name);
		System.out.println("Student address : "+address);
		System.out.println("Student age : "+age);
		System.out.println("Depart Name : "+deptName);
		System.out.println("Current Semetster : "+currentSemester);
	}
	
	
	
}
