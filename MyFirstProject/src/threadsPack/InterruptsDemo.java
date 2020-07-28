package threadsPack;

class ThreadTest extends Thread{
	@Override
    public void run() {     
        while (!Thread.interrupted()) {     //check for interrupted status
            System.out.println("Thread is running...");
        }
        System.out.println("Thread stopped!!!");
    }
}

public class InterruptsDemo {

	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		t.start();
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e){
			e.getStackTrace();
		}
		t.interrupt();

	}

}
