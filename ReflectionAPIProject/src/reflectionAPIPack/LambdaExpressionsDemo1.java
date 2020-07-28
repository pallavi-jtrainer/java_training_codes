package reflectionAPIPack;

import java.util.ArrayList;
import java.util.function.*;

public class LambdaExpressionsDemo1 {

	public static void main(String[] args) {
		
		ArrayList<String> gamesList = new ArrayList<>();
		gamesList.add("Quiz");
		gamesList.add("Carrom");
		gamesList.add("Chess");
		gamesList.add("Monopoly");
		gamesList.add("Cards");
		gamesList.add("Table Tennis");
		gamesList.add("Ludo");
		
		Predicate<String> p = (s) -> s.startsWith("C");
		
		for(String str:gamesList) {
			if(p.test(str)) System.out.println(str);
		}
		
		
		
		
//		ArrayList<Integer> arrayList = new ArrayList<Integer>();
//		arrayList.add(10);
//		arrayList.add(21);
//		arrayList.add(32);
//		arrayList.add(43);
//		arrayList.add(54);
//		
//		//for(int i = 0;i<arrayList.size();i++) {}
////		for(Integer i: arrayList) {
////			
////		}
//		//printing the contents of list
//		System.out.println("All elements");
//		arrayList.forEach(i -> System.out.println(i));
//		
//		System.out.println();
//		System.out.println("Even elements");
//		//print even numbers
//		arrayList.forEach(i -> {if(i%2 == 0) System.out.println(i);});

	}

}
