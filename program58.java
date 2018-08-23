/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   int i,n,k;
	   Scanner S=new Scanner(System.in);
	   n=S.nextInt();
	   k=S.nextInt();
	   boolean flag=false;
	   int a[]=new int[n];
	   for(i=0;i<n;i++)
	   {
	   	a[i]=S.nextInt();
	   }
	   for(i=0;i<n;i++)
	   {
	   	if(k==a[i])
	   	{
	   		flag=true;
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
