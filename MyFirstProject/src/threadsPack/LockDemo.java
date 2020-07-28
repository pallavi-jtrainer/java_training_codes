package threadsPack;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class WorkerThread implements Runnable{
	
	String name;
	ReentrantLock rlock;

	public WorkerThread(ReentrantLock r1, String n) {
		rlock = r1;
		name = n;
	}
	
	@Override
	public void run() {
		boolean done = false;
		
		while(!done) {
			boolean isLocked = rlock.tryLock();
			if(isLocked) {
				Date date =  new Date();
				SimpleDateFormat sdf =  new SimpleDateFormat("hh:mm:ss");
				
				System.out.println("task name: " + name + "lock acquired at "
						+ sdf.format(date));
				
				try {
					Thread.sleep(15000);
					
					//acquire the lock - inner lock
					rlock.lock();
					
					try {
						date = new Date();
						
						System.out.println("task name - " + name + " inner lock acquired at "
								+ sdf.format(date));
						System.out.println("Lock hold count: " + rlock.getHoldCount());
						Thread.sleep(1000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}finally {
						System.out.println("Unlocking the resource. Released by - " + name);
						rlock.unlock();
					}
					System.out.println("Lock hold count: " + rlock.getHoldCount());
					System.out.println("Work done! task name - " + name);
					done = true;
					
				}catch(InterruptedException e) {
					e.printStackTrace();
				}finally {
					System.out.println("releasing lock. task name - " + name);
					rlock.unlock();
					System.out.println("Lock hold count: " + rlock.getHoldCount());
					
					
				}
				
			}else {
				System.out.println("task name - " + name + " waiting for lock");
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}

public class LockDemo {

	/*
	 * ReentrantLock Methods
	 * lock()
	 * unlock()
	 * tryLock()
	 * getHoldCount()
	 * isHeldByCurrentThread()
	 * 
	 */
	public static void main(String[] args) {
		ReentrantLock re =  new ReentrantLock();
		
		ExecutorService pool = Executors.newFixedThreadPool(2);
		Runnable wt1 = new WorkerThread(re, "Task1");
		Runnable wt2 = new WorkerThread(re, "Task2");
		Runnable wt3 = new WorkerThread(re, "Task3");
		
		pool.execute(wt1);
		pool.execute(wt2);
		pool.execute(wt3);
		
		pool.shutdown();

	}

}
