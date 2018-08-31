/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		float n,k;
		Scanner s=new Scanner(System.in);
		n=s.nextFloat();
		k=s.nextFloat();
		double r;
		r=n*k;
		System.out.println(""+String.format("%5f",r));
	}
}
