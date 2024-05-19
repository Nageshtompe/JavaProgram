public class Triangle
{
	public static void main(String args[]){
	
	int s1=5;
	int s2=8;
	int s3=9;
	
	if(s1==s2&&s2==s3)
		System.out.println("Equilateral Triangle");
	else if(s1==s2||s2==s3||s3==s1)
		System.out.println("isoceles triangle");
	else
		System.out.println("scalene triangle");
	
	}
}