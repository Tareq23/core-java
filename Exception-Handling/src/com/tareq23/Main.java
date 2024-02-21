package com.tareq23;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	
	private static void tryCatch()
	{
		int x = 50;
		int y = 0;
		int divider;
		
		int[] nums = {143};
//		Random random = new Random();
		int index = new Random().nextInt(0, 10);
		
		try {
			divider = nums[index]/ y;
		}
		catch(ArithmeticException exception) {
			System.out.println("Arithmetic Exception: "+exception.getLocalizedMessage());
		}
		catch(IndexOutOfBoundsException exception) {
			System.out.println("Outer exception"+exception.getMessage());
		}
	}
	
	public static void ageValidate(int age) throws InvalidAgeException{
		
		if(age < 18) {
			throw new InvalidAgeException("voter age have to be larger than or equal to 18");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Hello Exception");
		
//		tryCatch();
//		checkThrow();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter voter age: ");
		int age = sc.nextInt();
		
		try {
			ageValidate(age);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("rest of the code");
	}
	
	
	private static void checkThrow() throws IndexOutOfBoundsException
	{
		int[] nums = {111,3321};
		
		if(nums.length < 3) {
			throw new IndexOutOfBoundsException("Index out of bound");
		}
		
		System.out.println();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
