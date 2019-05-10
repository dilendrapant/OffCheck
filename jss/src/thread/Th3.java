package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.sun.corba.se.impl.orbutil.closure.Future;

public class Th3 implements Callable<Object>
{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return Thread.currentThread().getName()+" Excuting .............";
	}
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args)throws InterruptedException,
    ExecutionException {
		
		
		ExecutorService exe = Executors.newFixedThreadPool(2);
		
		//System.out.println(exe.submit(new th3()));
		
		Future f1 = (Future) exe.submit(new Th3());
		
		@SuppressWarnings("unused")
		Future f2 = (Future) exe.submit(new Th3());
		System.out.println(((java.util.concurrent.Future) f1).get());
		
		
	}

}
