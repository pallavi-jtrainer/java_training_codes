package threadsPack;

public class ThreadPriorityDemo extends Thread{

	public void run() {
		System.out.println("Running...");
	}
	
	public void returnValue() {
		System.out.println("[" + Thread.currentThread().getName() + "] - running");
	}
	
	public static void main(String[] args) {
		ThreadPriorityDemo t1 = new ThreadPriorityDemo();
		ThreadPriorityDemo t2 = new ThreadPriorityDemo();
		ThreadPriorityDemo t3 = new ThreadPriorityDemo();
		
		//getPriority
		System.out.println("t1 Priority: " + t1.getPriority());
		System.out.println("t2 Priority: " + t2.getPriority());
		System.out.println("t3 Priority: " + t3.getPriority());
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(3);
		t3.setPriority(8);
		
//		System.out.println("t1 Priority: " + t1.getPriority());
//		System.out.println("t2 Priority: " + t2.getPriority());
//		System.out.println("t3 Priority: " + t3.getPriority());
		
		t2.returnValue();
		t1.returnValue();
		t3.returnValue();
		
		
		
	}

}
