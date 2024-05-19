package String;

import java.util.Arrays;

public class ReverseCharecter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="You all are very very very good students";
		
		//uoY lla era yrev yrev yrev doog stneduts
		
		String s1[]=s.split(" ");
		String reverseStr="";
		
		for(int i=0;i<s1.length;i++)
		{
			String temp=s1[i];
			String s2="";
			
			for(int j=temp.length()-1;j>=0;j--)
			{
				s2=s2+temp.charAt(j);
			}
			reverseStr=reverseStr+s2+" ";
		}
		System.out.println(reverseStr);

	}

}
