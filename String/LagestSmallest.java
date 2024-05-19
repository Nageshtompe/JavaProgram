package String;

import java.util.Arrays;

public class LagestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="hi welcome to hefshine";
		
		String sa[]=s.split(" ");
		
		
		for(int i=0;i<sa.length;i++)
		{
			for(int j=i+1;j<sa.length;j++)
			{
				if(sa[i].length()>sa[i].length())
				{
					String temp=sa[i];
					sa[i]=sa[j];
					sa[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(sa));
		System.out.println("largest String : "+sa[sa.length-1]);

		System.out.println("Smallest String : "+sa[0]);

	}

}
