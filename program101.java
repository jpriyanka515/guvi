/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    String str;
	    int n,p,i;
	    Scanner s=new Scanner(System.in);
	    str=s.next();
	    n=s.nextInt();
	    p=str.length()-n;
	    for(i=p;i<str.length();i++)
	    {
	    System.out.println(str.charAt(i));
	    }
	}
}
