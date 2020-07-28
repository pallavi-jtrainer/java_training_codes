package demoPack;

import java.util.*;
import java.util.stream.*;

public class StreamDemo {

	public static void main(String[] args) {
		//creating a list of integers
//		List<Integer> nList = Arrays.asList(12,23,34,45,56);
//		
//		List<Integer> square = nList.stream().map(x -> x*x).collect(Collectors.toList());
//		
//		System.out.println(square);
		
		//list of games
		List<String> gamesList = new ArrayList<>();
		gamesList.add("Quiz");
		gamesList.add("Carrom");
		gamesList.add("Chess");
		gamesList.add("Monopoly");
		gamesList.add("Cards");
		gamesList.add("Table Tennis");
		gamesList.add("Ludo");
		
//		List<String> favGames = gamesList.stream().filter(s->s.startsWith("C")).
//				collect(Collectors.toList());
//		System.out.println(favGames);
	
		System.out.println("Unsorted List: " + gamesList);
		List<String> sortedList = gamesList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List: "+ sortedList);
		
	
		

	}

}
