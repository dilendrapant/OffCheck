package thread;

public class Th2 implements Runnable{

	@Override
	public void run() {
		System.out.println("Started");
		
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Th2());
		t1.start();
	}

}
