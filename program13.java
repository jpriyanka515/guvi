/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
{
	int n,r=2;
	Scanner S=new Scanner(System.in);
	n=S.nextInt();
	while(n>r)
	{
		if(n%r!=0)
		{
			r++;
	    }
    }
    if(n==r)
    {
    	System.out.println("yes");
    }
    else
    System.out.println("no");
	}
}
