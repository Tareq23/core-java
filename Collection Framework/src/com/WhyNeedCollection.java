package com;

public class WhyNeedCollection {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		int e = 10;
		System.out.println(a+b+c+d+e);
		
		// An array belongs to homogeneous data and fixed size
		
		int ar[] = new int[1000];
			ar[0] = 10;
//			ar[2] = 12f;  here encountered error for float type data;
		Student stu[] = new Student[1000];
		stu[0] = new Student();
//		stu[0].x = 50;
//		Student s1 = new Student();
		
//		str[0] = new Teacher(); error encountered class type mismatch 
		
		Object obj = new Teacher();
		Object obj2 = new Student();
		
		System.out.println(stu[0].x);
		
		
		// Ready made( build in)  APIs does not support in array 
	}

}


class Student{
	public int x;
	public int y;
	public static int i=1;
	public Student()
	{
		this.x = 23;
		this.y = 34;
		System.out.println("Empty Constructor "+(i++));
	}
}

class Teacher{
	
}
