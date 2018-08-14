/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,max,min;
		Scanner S=new Scanner(System.in);
		n=S.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=S.nextInt();
		}
		max=a[0];
		for(i=1;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		min=a[0];
		for(i=1;i<n;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(min+" "+max);
	}
}
