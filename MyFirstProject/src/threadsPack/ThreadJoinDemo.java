package threadsPack;

class Task implements Runnable{
	private int sleeptime, sum = 0;
	public Task(int value) {
		this.sleeptime = value;
	}
	
	@Override
	public void run() {
		for(int i = 0; i<5;i++) {
			System.out.println("Current thread: " + Thread.currentThread().getName());;
			sum += i;
			
			try {
				Thread.sleep(sleeptime);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public int getSum() {
		return sum;
	}
}

public class ThreadJoinDemo {

	public static void main(String[] args) {
		System.out.println("In Main");
		
		//Task class threads
		Task t1 = new Task(1000);
		Task t2 = new Task(5001);
		Task t3 = new Task(10000);
		
		//Thread class threads to run the task threads
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		Thread thread3 = new Thread(t3);
		
		//naming the threads
		thread1.setName("Thread 1");
		thread2.setName("Thread 2");
		thread3.setName("Thread 3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		System.out.println("Current thread: " + Thread.currentThread().getName() 
				+ "waiting for " + thread1.getName());
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(thread1.getName() + "done. Result: " + t1.getSum());
		
		
		//thread 2
		System.out.println("Current thread: " + Thread.currentThread().getName() 
				+ "waiting for " + thread2.getName());
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(thread2.getName() + "done. Result: " + t2.getSum());
		
		System.out.println("Main done");
		
		
	}

}
