package jul_27_2020;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		
		//TreeSet<Integer> numbers = new TreeSet<>(Collections.reverseOrder());

		
		numbers.add(10);
		numbers.add(1);
		numbers.add(100);
		numbers.add(15);
		numbers.add(34);
		numbers.add(50);
		
		numbers.add(50);
		
		System.out.println(numbers);
		
		System.out.println(numbers.descendingSet());
		
		System.out.println("First Value: " + numbers.first());
		
		
		
	}

}
