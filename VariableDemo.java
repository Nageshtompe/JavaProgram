
public class Demo {
	

		int a=10;						//instance variable are accessed by using the object 
		
		static int b=20;				//the static variable are accessed by class name

		public void test()
		{
			int a=20;					//local variable is accessible within the block and 
			//this.a=a;					//its not accessible outside the block or method
		}
	}

	class VariableDemo
	{

		public static void main(String[] args) {
			
			Demo d=new Demo();
			d.test();
			
			System.out.println(d.a);
			
			//System.out.println(Demo.b);
		}


	}
