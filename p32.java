/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k,i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		boolean flag=false;
		int a[]=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(k==a[i])
			{
				flag=true;
				break;
			}
			else
			{
				flag=false;
			}
		}
		if(flag)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
