package threadsPack;

class StopThreadClass extends Thread{
	//volatile variable
	private volatile boolean done = false;
	
	public void stopThread() {
		done = true;
	}
	
	@Override
	public void run() {
		while(done != true) {
			System.out.println("Thread is running..........");
		}
		
		System.out.println("Thread has stopped...!");
	}
}

public class ThreadInterruptDemo {

	public static void main(String[] args) {
		StopThreadClass st = new StopThreadClass();
		st.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		st.stopThread();
	}

}
