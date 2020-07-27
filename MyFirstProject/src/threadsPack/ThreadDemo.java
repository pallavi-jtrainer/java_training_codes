package threadsPack;

/*
 * 2 methods to work with threads
 * 1. extending the java.lang.Thread class
 * 2. implementing the java.lang.Runnable interface
 * 
 */

import java.lang.*;

//public class ThreadDemo extends Thread{
//	
//	public void run() {
//		System.out.println("Thread is running");
//	}
//	
//	public static void main(String[] args) {
//		ThreadDemo td = new ThreadDemo();
//		td.start();
//
//	}
//
//}

//public class ThreadDemo implements Runnable{
//	
//	public static void main(String[] args) {
//		Thread thread = new Thread(new ThreadDemo());
//		
//		thread.start();
//	}
//
//	@Override
//	public void run() {
//		System.out.println("thread is running ....");
//		
//	}
//}


public class ThreadDemo implements Runnable{

	String name;
	Thread t;
	
	public ThreadDemo(String thread) {
		name = thread;
		t = new Thread(this, name);
		System.out.println(" New Thread: " + t);
		t.start();
	}
	
	@Override
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println(name + " : " + i);
				Thread.sleep(10000);
			}
		}catch(InterruptedException e) {
			System.out.println("Interrupted: " + name);
		}
		
		System.out.println(name + " Exiting");
	}
	public static void main(String[] args) {
			System.out.println("Main starting");	
		try {
			Thread.sleep(10000);
			new ThreadDemo("one");
			System.out.println("Thread 1");
			new ThreadDemo("two");
			System.out.println("Thread 2");
			new ThreadDemo("three");
		}catch(InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		
		
		
		System.out.println("Main thread exiting");
	}
}

























