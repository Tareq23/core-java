package com.tareq23;

import java.io.IOException;
import java.util.Random;

public class ThrowsTest {

	
	static void fun() throws IndexOutOfBoundsException
	{
		int index = new Random().nextInt(0, 10);
		int[] nums = {43,2,5,12,144};
		System.out.println(nums[index]);
		
	}
	
	
	public static void main(String[] args) {
		
		
		fun();

	}

}
