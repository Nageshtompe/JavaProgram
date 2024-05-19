
public class SolveProblem {

	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=20;
		int result=0;
		myCode(num1,num2,result);
	}
	//EndOfMainMethod
	private static void myCode(int num1,int num2,int result) 
	{
		AdditionDemo d = new AdditionDemo();
		System.out.println(d.addtion(num1, num2));
		System.out.println(d.multiplication(num1, num2));
		System.out.println(d.division(num1, num2));
		System.out.println(d.subtraction(num1, num2));
	}
	static class AdditionDemo
	{
		int number1;
		int number2;
		int result;
		public int addtion(int num1,int num2)
		{
			result=num1+num2;
			return result;
		}
		public int subtraction(int num1,int num2)
		{
			result=num1-num2;
			return result;
		}
		public int multiplication(int num1,int num2)
		{
			return num1*num2;
		}
		public int division(int num1,int num2) 
		{
			return num1/num2;
		}
	}
	//WriteCode Here
}

