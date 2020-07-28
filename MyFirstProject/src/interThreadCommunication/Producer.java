package interThreadCommunication;

import java.util.List;

public class Producer implements Runnable{

	private List<Integer> taskQueue;
	private int max_capacity;
	
	public Producer(List<Integer> q, int n) {
		taskQueue = q;
		max_capacity = n;
	}
	
	@Override
	public void run() {
		
		int counter = 0;
		
		while(true) {
			try {
				produce(counter++);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void produce(int count)throws InterruptedException {
		synchronized (taskQueue) {
			while(taskQueue.size() == max_capacity) {
				System.out.println("Queue is full." + Thread.currentThread().getName()
						+ " is waiting, size " + taskQueue.size());
				taskQueue.wait();
			}
			
			Thread.sleep(1000);
			taskQueue.add(count);
			System.out.println("Task Produced " + count );
			taskQueue.notifyAll();
		}
	}

}
