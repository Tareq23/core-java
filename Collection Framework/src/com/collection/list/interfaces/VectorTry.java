package com.collection.list.interfaces;

import java.util.Collections;
import java.util.Vector;

public class VectorTry {

	public static void main(String[] args) {
	
			Vector<String> vec = new Vector<String>();
			
//			vec.add(null);
			vec.add("tareq");
			vec.add("tareq1");
			vec.add("tareq3");
			vec.add("tareq");
			vec.add("tareq6");
			System.out.println(vec);
			for(int i=0; i<vec.size(); i++)
			{
				System.out.println(i+"'th element : -> "+vec.get(i));
			}
			
			System.out.println("vector first element : -> "+vec.firstElement());
			System.out.println("vector last element : -> "+vec.lastElement());
			
			
			//collection sort
			Collections.sort(vec);

			System.out.println(vec);
			
	}

}
