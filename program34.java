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
		int line=0,i,n;
		Scanner S=new Scanner(System.in);
		str=S.nextLine();
		n=str.length();
		for(i=0;i<n;i++)
		{
			if(str.charAt(i)=='.'||str.charAt(i)==' ')
			{
		
		              line++;
			}
		}
		System.out.println(line);
		
		
	}
}
