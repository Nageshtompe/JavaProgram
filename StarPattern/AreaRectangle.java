public class AreaRectangle
{
	public static void main(String arg[])
	{	
		int r=5;
		circle(r);
	}
	public static void circle(int r)
	{
		double area=3.14*r*r;
		double peri=2*3.14*r;
		//peri=peri*10;			//it gives answer 31.4 not 31.400000000
		//int temp=(int)peri;
		//peri=temp;
		//peri=peri/10;


		System.out.println(area+" "+peri);	
	}
}	