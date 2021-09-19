package main;

import try_oop.Student;

public class Main {

	public static void main(String[] args)
	{
		
		String stuName = "Tareq";
		String stuAdd = "Bhola";
		int age = 24;
		String deptName = "CSE";
		String currentSemester = "4/1";
		Student student = new Student(stuName,stuAdd,age,deptName,currentSemester);
		student.displayStudentInfo();

	}

}
