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
		char k;
		Scanner s=new Scanner(System.in);
		str=s.next();
		k=s.next().charAt(0);
		int i,n,j;
		n=str.length();
		char[] ch=str.toCharArray();
		j=0;
		for(i=0;i<n;i++)
		{
			if(k==ch[i])
			{
				j++;
			}
		}
		System.out.println(j);
	}
}
