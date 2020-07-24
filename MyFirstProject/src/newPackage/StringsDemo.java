package newPackage;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringsDemo {
	
	static void StringDemo() {
		/*
		 * to create 
		 * method1: string literal
		 * method2: new keyword
		 * 
		 * JVM looks at the string pool when a string is created
		 * using string literal
		 * 
		 * 
		 * Methods:
		 * charAt
		 * length
		 * substring
		 * contains
		 * join
		 * equals
		 * isEmpty
		 * concat
		 * replace
		 * split
		 * indexOf
		 * toLowerCase
		 * toUpperCase
		 * trim
		 * compareTo
		 * startsWith
		 * endsWith
		 * valueOf
		 * equalsIgnoreCase
		 * toCharArray
		 * 
		 * 
		 */
		
		String s = "This is a test string";
		String s1 = "My new string";
		
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("Same");
		}
		else
			System.out.println("Not same");
		
		String[] arr = s.split(" ");
		
		System.out.println("Contents of array: " + Arrays.toString(arr));
		
		
		s = s.concat(" to demo strings");
		System.out.println(s);
		
		s = s.replace('i', 'a');
		System.out.println(s);
		
		s1 = String.join("-", s, s1);
		
		System.out.println(s1);
		
		System.out.println("Character at index 3: " + s.charAt(3));
		
	}
	
	static void stringBufferDemo() {
		/*
		 * Stringbuffer class creates mutable strings
		 * 
		 * thread - safe class i.e multiple threads cannot access it simultanouely
		 * 
		 * create a string using constructor
		 * 
		 * default capacity = 16 bytes
		 * 
		 * (currentcapacity * 2) + 2 = new capacity
		 * 
		 * Methods:
		 * append(s)
		 * insert
		 * replace
		 * delete
		 * reverse
		 * capacity
		 * charAt
		 * length
		 * substring
		 * 
		 */
		
		StringBuffer sb = new StringBuffer();
		sb.append("This is a string buffer");
		sb.append(" string");
		
		System.out.println(sb);
		
		sb.insert(10, "new ");
		
		System.out.println(sb);
		
		StringBuffer sb1 = new StringBuffer("Hello");
		sb1.append(" Welcome");
		System.out.println(sb1);
		
		
	}
	
	
	static void stringBuilderDemo() {
		/*
		 * StringBuilder => create mutable strings
		 * 
		 * stringbuilder()
		 */
		
		StringBuilder sb = new StringBuilder(30);
		
		sb.append("This is a string created using StringBuilder and is a mutable string");
		System.out.println(sb);
	}
	
	static void stringTokenizerDemo() {
		System.out.println("Constructor1");
		StringTokenizer st = new StringTokenizer("Hello How are you");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
		
		System.out.println();
		System.out.println("Constructor2");
		StringTokenizer st1 = new StringTokenizer("Hello; How; are; you","; ");
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
		}
		
		System.out.println();
		System.out.println("Constructor3");
		StringTokenizer st2 = new StringTokenizer("Hello; How; are; you", "; ", true);
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}

	public static void main(String[] args) {
		
		//StringDemo();
		//stringBufferDemo();
		//stringBuilderDemo();
		stringTokenizerDemo();
	}

}
