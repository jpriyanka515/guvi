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
		int i,count=0,co=0;
		Scanner S=new Scanner(System.in);
		str=S.next();
		for(i=0;i<str.length();i++)
		{
		if(str.charAt(i)>='0'&&str.charAt(i)<='9')
		{
			count++;
		}
		if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
		{
		co++;
		}
		}
		if(count==0 || co==0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
