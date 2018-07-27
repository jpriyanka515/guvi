/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,b,n;
		Scanner S=new Scanner(System.in);
		a=S.nextInt();
		b=S.nextInt();
		for(n=2;(n>=a&&n<b);n++)
		{
			if(n%2==0)
			{
				n++;
			}
			System.out.println(n);
		}
	}
}
	
