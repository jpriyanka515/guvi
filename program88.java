/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int gcd=0,lcm,n,k;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		k=s.nextInt();
		for(int i=1;i<=n && i<=k;i++)
		{
			if(n%i==0 && k%i==0)
			{
				gcd=i;
				
			}
		}
		lcm=(n*k)/gcd;
		System.out.println(lcm);
	}
}
