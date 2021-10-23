package com.collection.interfaces;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceTry {

	public static void main(String[] args) {
	
		Collection<String> studentCollection = new ArrayList<String>();
		
		studentCollection.add("tareq");
		studentCollection.add("shuvo");
		studentCollection.add("nahid");
		studentCollection.add("ayan");
		studentCollection.add("abir");
		
//		System.out.println(studentCollection);
//		
//		// remove tareq
//		studentCollection.remove("tareq");
//		System.out.println(studentCollection);
//		
//		//Get class name which is assign in collection
//		System.out.println(studentCollection.getClass());
//		
//		// check object which is added or not and if added return true else false
//	    System.out.println(studentCollection.contains("shuvo"));
//	    System.out.println(studentCollection.contains("tareq"));
//	    
//	    ArrayList<String> stuList = new ArrayList<String>();
//	    
//		stuList.addAll(studentCollection);
//		
//		System.out.println("copy from studentCollection to stuList "+stuList);
//		
//		
//		studentCollection.addAll(stuList);
//		
//		System.out.println(studentCollection);
//		
//		//hash code
//		System.out.println("hash code for studentCollection "+studentCollection.hashCode());
//		System.out.println("hash code for stuList "+stuList.hashCode());
//		
//		System.out.println(studentCollection.equals(stuList));
//		
//		ArrayList<String> stuList2 = new ArrayList<String>();
//		stuList2.addAll(studentCollection);
//		System.out.println(stuList.equals(studentCollection));
//		stuList2.toArray();
//		
//		System.out.println(stuList2.get(0));
//		
//		studentCollection.toArray();

		studentCollection.forEach((element)->{
			System.out.println( " --> "+ element);
		});
		
		studentCollection.clear();
		System.out.println("size after clear  : "+studentCollection.size());
	}

}
