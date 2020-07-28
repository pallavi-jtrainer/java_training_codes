package interThreadCommunication;

import java.util.List;

public class Consumer implements Runnable{

	private List<Integer> taskQ;
	
	public Consumer(List<Integer> q) {
		this.taskQ = q;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				consume();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void consume() throws InterruptedException {
		synchronized (taskQ) {
			while(taskQ.isEmpty()) {
				System.out.println("Queue empty " + Thread.currentThread().getName() +
						" is waiting, size: " + taskQ.size());
				taskQ.wait();
			}
			
			Thread.sleep(1000);
			int i = (Integer) taskQ.remove(0);
			System.out.println("Consumed: " + i);
			taskQ.notifyAll();
		}
	}

}
