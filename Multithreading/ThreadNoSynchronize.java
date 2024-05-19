package Multithreading;

public class ThreadNoSynchronize extends Thread {
	
	
	Counter counter;
	public ThreadNoSynchronize(Counter counter) {
		this.counter=counter;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		counter.incrementCount();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter counter = new Counter();
		Thread t1=new ThreadNoSynchronize(counter);
		Thread t2=new ThreadNoSynchronize(counter);
		
		t1.start();
		t2.start();
		try {
			Thread.sleep(100);
		}catch(InterruptedException e){
		}
		System.out.println("Count is "+counter.getCount());
	}
}
