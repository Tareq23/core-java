package com.collection.list.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ArrayListTry {


	public static void main(String[] args) {
		
		
//		ArrayList<Integer> intList = new List<Integer>();
		List<Integer> intList = new ArrayList<Integer>();
		
		Random random = new Random();
		
		//ArrayList add method
		for(int i=0; i<100; i++)
		{
			intList.add(random.nextInt(27));
		}
		System.out.println(intList);
		
		// ArrayList index access with get method
		int evenCount=0;
		for(int i=0; i<intList.size(); i++)
		{
			int x = intList.get(i);
			if(x%2==0) {
				evenCount++;
			}
		}
		System.out.println("Total even number  : "+evenCount);
		System.out.println("Total Odd Number : "+(intList.size()-evenCount));
		
		ArrayList<Integer> arList = new ArrayList<Integer>();
		arList.add(2333);
		arList.add(22);
		arList.add(23);
		arList.add(24);
		
		// addAll methods
		intList.addAll(arList);
		
		System.out.println(intList);
		
		arList.clear();
		
		System.out.println("last index of 3 :-> "+intList.lastIndexOf(3));
		System.out.println("last index of 24 :-> "+intList.lastIndexOf(24)+" list size : "+intList.size());
		
//		Object[] objAr = intList.toArray();
		
		Integer[] ar = new Integer[intList.size()];
		
		ar = intList.toArray(ar);
		
		for(int i=1; i<ar.length;i++)
		{
			ar[i] += ar[i-1];
		}
		//cumulative sum
		System.out.println("Cumulative sum of Integer Array which coming intList ArrayList : "+ar[ar.length-1]);
		
//		System.out.println("Shallow Copy : "+intList.clone);
//		Object[] ar = intList
		
		System.out.println("check 23 contains or not :-> "+intList.contains(23));
		arList.add(1001);
		System.out.println("check arList contains or not within intList :-> "+intList.containsAll(arList));
		
		intList.removeIf(x->(x%3==0));
		
		System.out.println("After remove even number : "+intList);
		
		intList.set(0, 111);
		
		System.out.println(intList);
		
//		intList.sort(null);
		Collections.sort(intList);
		
		System.out.println("sorted List : "+intList);
		
		
//		ArrayList<Integer> anotherList = new ArrayList<Integer>(intList);
		ArrayList<Integer> anotherList = new ArrayList<Integer>(intList.subList(0, 5));
		
		System.out.println("IntList size : "+intList.size());
		System.out.println("AnotherList size : "+anotherList.size());
		
		for(int i=0 ; i<anotherList.size(); i++)
		{
			System.out.printf("%d ",anotherList.get(i));
		}
		
				
	}

}
