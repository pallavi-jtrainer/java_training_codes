package newPackage;

//import java.util.ArrayList;
//import java.util.Iterator;

import java.util.*;

public class CollectionsDemo {

	static void arrayListDemo() {
		/*
		 * ArrayList => implements the List interface
		 * 			=> allows duplicate values
		 * 			=> different datatypes
		 * 			=> random access of elements
		 * Syntax:
		 * 		ArrayList<datatype> arraylist_name = new ArrayList<datatype>();
		 */
		
		List<String> names = new ArrayList<String>();
		
		names.add("Neha");
		names.add("Mona");
		names.add("Tina");
		names.add("Kavya");
		names.add("Divya");
		
		
		/*
		 * Methods in ArrayList
		 * get
		 * set
		 * remove
		 * removeall
		 * contains
		 * size
		 * isEmpty
		 * 
		 */
		
		System.out.println("Before replacing");
		String s = names.get(2);
		System.out.println(s);
		
		names.set(2, "Nayan");
		
		System.out.println();
		System.out.println("After replacing");
		String s1 = names.get(2);
		System.out.println(s1);
		
//		names.remove(2);
//		names.removeAll(names);
		
		System.out.println(names.contains("Kavya"));
		System.out.println("Size: " + names.size());
		System.out.println("Empty? " + names.isEmpty());
		System.out.println();
		
		/**
		 * Iterator interface => used to navigate the collections
		 * Iterator itr = arraylist_name.Iterator();
		 */
		
//		for(String s : names) {
//			System.out.println(s);
//		}
		
		Iterator itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	static void stackDemo() {
		/*
		 * stack follows LIFO => Last In First Out
		 * subclass of the Vector
		 * 
		 * Methods
		 * push => add to stack
		 * pop => remove from stack
		 * peek => returns top most element
		 * Empty => check whether stack is empty
		 */
		
		Stack<Integer> numbers = new Stack<Integer>();
		numbers.push(23);
		numbers.push(45);
		numbers.push(34);
		
		
//		System.out.println();
//		System.out.println("Elements in the stack");
//		
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//numbers.pop();
		int ele = numbers.elementAt(2);
		System.out.println(ele);
		
		ele = numbers.peek();
		System.out.println("Top most: "+ ele);
		
		System.out.println(numbers.empty());
		
		Iterator itr = numbers.iterator();
		
		System.out.println();
		System.out.println("Elements in the stack");
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	static void queueDemo() {
		/*
		 * Queue Interface => follows FIFO => First In First Out
		 * PriorityQueue
		 *
		 * Methods
		 * remove
		 * peek
		 * size
		 * isEmpty
		 * 
		 */
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("Java");
		pq.add("JavaScript");
		pq.add("Spring");
		pq.add("Hibernate");
		pq.add("JSP");
		
		
		System.out.println("Contents of the queue: " + pq);
		
	}
	
	static void arrayDequeDemo() {
		/*
		 * ArrayDeque => Array Deck 
		 * no capacity restriction
		 * no access multiple threads
		 * no null elements
		 * faster than arraylist and a linked list
		 * 
		 */
		
		ArrayDeque<String> arrdeq = new ArrayDeque<String>();
		arrdeq.add("Java");
		arrdeq.add("Hibernate");
		arrdeq.add("Spring");
		arrdeq.addFirst("JSP");
		

		System.out.println("Elements before: ");
		for(String ele : arrdeq) {
			System.out.println(ele);
		}
		
		arrdeq.remove();
		
		
		System.out.println("Elements after: ");
		for(String ele : arrdeq) {
			System.out.println(ele);
		}
		
	}
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//stackDemo();
//		queueDemo();
		arrayDequeDemo();
		
	}

}
