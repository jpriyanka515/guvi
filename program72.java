/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i;
		String str;
		Scanner S=new Scanner(System.in);
		str=S.next();
		boolean flag=false;
		for(i=0;i<str.length();i++)
		{
                         if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                         {
                         flag=true;	
                         }
                      
		}
		if(flag)
		{
			System.out.println("yes");
		}
		else
		System.out.println("no");
	}
}
