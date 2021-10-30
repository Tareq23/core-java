package com.collection.list.interfaces;

import java.util.LinkedList;

public class LinkedListTry {

	public static void main(String[] args) {
		
		
		LinkedList<String> linkList = new LinkedList<String>();
		
		linkList.add("abc");
		linkList.add("axc");
		linkList.add("acc");
		linkList.add("avc");
		linkList.add("abc");
		
		System.out.println(linkList);
		
		LinkedList<String> copyList = new LinkedList<String>(linkList);
		System.out.println("Copy from linkList : "+copyList);
		
		copyList.add("xyz");
		
		System.out.println(copyList);
		
		copyList.addFirst("tareq");
		copyList.addLast("ayan");
		
		System.out.println("addFirst and addLast methods check : "+copyList);
		
		linkList.clear();
		
		linkList.addAll(copyList);
		
		System.out.println("addAll methods checks : "+linkList);
		
		System.out.println("getFirst : "+linkList.getFirst());
		System.out.println("getLast : "+linkList.getLast());
		System.out.println("element   : "+linkList.element());
		
		
		copyList.push("push");
		
		
		System.out.println("push method check : "+copyList);
		
		
		copyList.remove();
		
		System.out.println("remove method check  : "+copyList);// remove first element
		
		copyList.removeLast(); // remove last element
		copyList.removeFirst();//remove first element
		System.out.println("removeLast and removeFirst  methods check : "+copyList);
		
		String str = copyList.peek();
		
		String str2 = copyList.peekLast();
		System.out.println(str + "\t-->\t"+ str2);
		System.out.println(copyList);
		
		String strPoll = copyList.poll();
		System.out.println(strPoll + "  ==> "+copyList);
		String strPollLast = copyList.pollLast();
		System.out.println(strPollLast +  "  ---> "+copyList);
		
		String strPop = copyList.pop();
		System.out.println(strPop);

	}

}
