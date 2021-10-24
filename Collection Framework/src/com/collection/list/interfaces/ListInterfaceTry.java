package com.collection.list.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ListInterfaceTry {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<String>();
		
//		ArrayList<String> lst = (ArrayList<String>) new List<String>();
		
		list.add(null);
		list.add(null);
		list.add(null);
		System.out.println(list);
		
		list.add("element0");
		
		System.out.println(list);
		
		list.forEach((lst)->{
			System.out.println(lst);
		});
		
		list.add("element1");
		list.add("element2");
		list.add("element3");
		list.add("element4");
		list.add("element5");
		
		System.out.println("size - 2th element : "+list.get(list.size()-2));
		System.out.println("All element : "+list);
		list.removeIf(str -> str==null); // if list has null then removes
		System.out.println(list);
		
		String[] sr = new String[list.size()];
		sr = list.toArray(sr);

		for(int i=0; i<list.size(); i++)
		{
			System.out.println((i+1)+" ---> "+sr[i]);
		}
		
		
		List<Integer> lInt = new ArrayList<Integer>();
		Random random = new Random();
		for(int i=1; i<100; i++)
		{
//			lInt.add(random.range(100));
			lInt.add(random.nextInt(100));
		}
		
		System.out.println(lInt);
		
		//sorting using Collections class
		Collections.sort(lInt);
		
		System.out.println(lInt);
		
		
		
	}

}
