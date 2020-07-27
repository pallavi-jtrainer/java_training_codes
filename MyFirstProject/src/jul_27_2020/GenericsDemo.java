package jul_27_2020;

import java.util.*;

public class GenericsDemo {

	public static void main(String[] args) {
		/*
		 * Wrapper class => class that converts primitive datatype into an object
		 * boxing => conversion from primitive datatype to object
		 * unboxing => conversion from object to primitive datatype
		 * 
		 * int = Integer
		 * boolean = Boolean
		 * float = Float
		 * etc.
		 */
		//int i1 = 10, i2 =20;
//		Integer i = new Integer(10); //boxing -> autoboxing
//		
//		//unboxing
//		//int i1 = i; //auto-unboxing
//		int i1 = i.intValue();
//		
//		List <Integer> list = new ArrayList<Integer>();
//		for(int i = 0; i < 5; i++)
//			list.add(i);
//		
//		//printint the contents
//		for(int i = 0; i < list.size(); i++)
//			System.out.println(list.get(i));
		
		List<String> items = new ArrayList<String>();
		
		items.add("ABC");
		items.add("BCD");
		
		GenericClassDemo<String> gen = new GenericClassDemo<String>(items);
		
		String s = (String) gen.issueItem();
		
		System.out.println(s);
		
		gen.returnItem(s);
		
		
		
	}

}
