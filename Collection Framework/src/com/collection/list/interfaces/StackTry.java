package com.collection.list.interfaces;

import java.util.Iterator;
import java.util.Stack;

public class StackTry {

	public static void main(String[] args) {
		
//		System.out.println("Java static class !!!!");
//		List<Integer> listSt = new Stack<Integer>();
		Stack<Integer> listSt = new Stack<Integer>();
		
//		listSt.add(22);
//		listSt.add(23);
//		listSt.add(25);
////		listSt.add("");
//		listSt.add(29);
//		
//		System.out.println(listSt);
//		
		
		listSt.push(9);
		listSt.push(29);
		listSt.push(9324);
		listSt.push(92);
		listSt.push(92);
		listSt.push(239);
		listSt.push(93);
		listSt.push(98);
		
		System.out.println(listSt);
		
		
		
		int sum=0;
		while(listSt.size()>0)
		{
			sum += listSt.pop();
		}
		
		System.out.println("Total stack value size : "+sum);
		
		
//		listSt.forEach(e->System.out.println(e));
		
//		int  x = listSt.pop();
//		Iterator iterator = listSt.iterator();
//		int sum=0,x=0;
//		while(iterator.hasNext())
//		{
////			sum += 
//			System.out.println(iterator.next());
//		}
		
//		while(listSt.)
		
//		int xx = listSt
		
//		System.out.println(listSt+"\nstack top value : "+x);
		
		Stack<Character> st = new Stack<Character>();
		st.push('c');
		st.push('d');
		st.push('e');
		
		for(int i=0; i<5; i++)
		{
			st.push('?');
		}
		
//		System.out.println(st);
//		System.out.println(st.get(2));
//		System.out.println(st.get(st.size()-1-2));
		
		
		
		
		

	}

}
