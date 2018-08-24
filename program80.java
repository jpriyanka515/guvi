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
		int n,i;
		boolean flag=false;
		char[] k=new char[10];
		Scanner s=new Scanner(System.in);
		str=s.next();
		char[] ch=str.toCharArray();
		n=str.length();
		for(i=0;i<n;i++)
		{
			if(ch[i]%2!=0)
			{   
			System.out.println(ch[i]);
			}
		}
		
		
	}
}
