/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,l,r;
		Scanner S=new Scanner(System.in);
		n=S.nextInt();
		l=S.nextInt();
		r=S.nextInt();
		if(n>l&&n<r)
		{
			System.out.println("yes");
		}
		else
		System.out.println("no");
	}
}
