public class Increment
{
	public static void main(String args[])
	{
		int num=5;
		System.out.println(num++);			//post increment
		System.out.println(++num);			//pre increment
		System.out.println(--num);			//pre decrement
		System.out.println(num--);			//post decrement
		
		int k=2;
		System.out.println(k++ - ++k + k-- - k++ + ++k -k-- + --k + k+ k--- k + --k+ k++);
	}
}
