/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,t=0,r,q,n;
		Scanner S=new Scanner(System.in);
		a=S.nextInt();
		b=S.nextInt();
		for(n=a+1;n<b;n++)
		{
			q=n;
			while(n!=0)
			{
				r=n%10;
				n=n/10;
				t=t+r*r*r;
			}
			if(t==q)
			{
			System.out.println(t);
			}
		}
	}
}
