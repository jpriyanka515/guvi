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
		int i,n,v=0;
		Scanner s=new Scanner(System.in);
		str1=s.next();
		str2=s.next();
		n=str1.length();
		for(i=0;i<n;i++)
		{
			if(str1.charAt(i)!=str2.charAt(i))
			{
				v++;
			}
		}
		if(v==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
