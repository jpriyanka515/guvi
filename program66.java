/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		float n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		boolean flag=false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
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
