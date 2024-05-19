package Variation;

import java.util.ArrayList;

public class SubstringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcab";
		ArrayList<String> list=new ArrayList<String>();
		
		for(int i=0;i<s.length();i++)
		{
			int cnt=0;
			for(int j=i;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					list.add(s.substring(i, j+1));
				}
			}
		}
		System.out.println(list);
		System.out.println(list.size());

	}

}
