
public class ArrangeZeroToLastOfArray {
	//StartOfMainMethod
	public static void main(String[] args) 
	{	
		int[] a= {0,1,3,0,2,5,0,-5,-8,9,0};
		myCode(a);
	}
	//EndOfMainMethod


	public static void myCode(int[] a) 
	{
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]==0)
			{
				int temp=a[i];
				for (int j = i; j < a.length-1; j++) {
					a[j]=a[j+1];
				}
				a[a.length-1]=temp;
			}
		}
		for(int data:a)
			System.out.print(data+" ");
		//write code here or  logic



	}

}



