/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,r,s=0,q;
		Scanner S=new Scanner(System.in);
		n=S.nextInt();
		q=n;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			s=s+r*r*r;
		}
		if(q==s)
		{
			System.out.println("yes");
		}
		else
		System.out.println("no");
	}
}
