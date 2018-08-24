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
		int n,i,j;
		Scanner s=new Scanner(System.in);
		str=s.next();
		n=str.length();
		char[] ch=str.toCharArray();
			if(n%2==0)
		              	{
				j=n/2;
				ch[j-1]='*';
				ch[j]='*';
				for(i=0;i<n;i++)
				{
				System.out.println(ch[i]);
				}
				}
				else
				{
					j=n/2;
					ch[j]='*';
					for(i=0;i<n;i++)
					{
					System.out.println(ch[i]);
					}
				}
		
	}
}
