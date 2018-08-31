/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,k,i,j;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[10];
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		i=k-1;
		System.out.println(a[i]);
	}
}
