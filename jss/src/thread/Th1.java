package thread;

import com.sun.jmx.snmp.Timestamp;

public class Th1 extends Thread 
{
	public void run() {
		evenNum();
	}
	
	static int evenNum() {
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println(i);
		}
		System.out.println("This is inside eVN"+77);
		return -1;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Th1 th1 = new Th1();
		Th1 th2 = new Th1();
		Thread t1 = new Thread(th1);
		t1.sleep(1000);
		Thread t2 = new Thread(th2);
		t1.sleep(2000);
		t1.start();
		t2.start();
	}
	
	
	

}
