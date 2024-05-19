package Multithreading;

public class Counter {
	
	int count=0;
	public void incrementCount() {
		for (int i = 0; i <10000; i++) {
			count=count+1;
		}
		System.out.println(count);
	}
	
	public int getCount() {
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter c= new Counter();
		
		c.incrementCount();
		

	}

}
