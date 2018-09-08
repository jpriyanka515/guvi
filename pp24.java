/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str;
		int n,i;
		boolean flag=false;
		Scanner s=new Scanner(System.in);
		str=s.next();
		n=str.length();
		char[] ch=str.toCharArray();
		for(i=0;i<n;i++)
		{
			if(ch[i]>='0'&&ch[i]<='9')
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
