public class AreaTriangle
{
	public static void main(String args[])
	{
		int side=10;
		area(side);
	}
	public static void area(int side)
	{
		double sqrt=Math.sqrt(3);			//Math.pow(6,4)
		double a= sqrt * side * side/4;
		System.out.println(a);
	}
}