package interThreadCommunication;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		List<Integer> tQueue = new ArrayList<Integer>();
		int capacity =  5;
		Thread tProduce = new Thread(new Producer(tQueue, capacity));
		Thread tConsume = new Thread(new Consumer(tQueue));
		
		tProduce.start();
		tConsume.start();

	}

}
