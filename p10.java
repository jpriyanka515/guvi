/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str1,str2;
		int i,n;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		str1=s.next();
		str2=s.next();
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		n=str1.length();
		for(i=0;i<n;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				flag=true;
			}
		}
		if(flag)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
		
	}
}
