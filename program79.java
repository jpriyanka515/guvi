/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2,p,i;
		boolean flag=false;
		Scanner S=new Scanner(System.in);
		n1=S.nextInt();
		n2=S.nextInt();
		p=n1*n2;
		for(i=1;i<p/2;i++)
		{
			if(p==i*i)
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
