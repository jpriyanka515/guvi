/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes her
		String str;
		int i;
		boolean flag=false;
		Scanner S=new Scanner(System.in);
		str=S.next();
		for(i=0;i<str.length();i++)
		{
		if(str.charAt(i)=='0'||str.charAt(i)=='1')
		{
			flag=true;
		}
		else
		{
		flag=false;
		}
	    }
	if(flag==true)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
}
}
