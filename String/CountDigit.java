package String;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="db34bhjb33j";
		
		int sum=0;
		char []ca=s1.toCharArray();					//also you can apply loop on string 
		for(int i=0;i<ca.length;i++)
		{
			if(ca[i]>='0'&&ca[i]<='9')
			{
				int num=ca[i]-48;
				sum+=num;
			}
		}
		System.out.println("sum of digit is : "+sum);

	}

}
