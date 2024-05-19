public class GrossSalary
{
	public static void main(String args[])
	{
			int basicSalary=35000;
			double grossSalary=0;
			
			if(basicSalary<=10000)
			{
				grossSalary=basicSalary+0.2*basicSalary+0.8*basicSalary;
			}
			else if(basicSalary<=20000)
			{
				grossSalary=basicSalary+0.25*basicSalary+0.9*basicSalary;
			}
			else
			{
				grossSalary=basicSalary+0.3*basicSalary+0.95*basicSalary;
			}
			System.out.println(grossSalary);
				
	}
}