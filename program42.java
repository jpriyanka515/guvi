/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	           String str1,str2;
		int n1,n2;
		Scanner S=new Scanner(System.in);
		str1=S.next();
		str2=S.next();
		n1=str1.length();
		n2=str2.length();
		if(n1>=n2)
		{
			System.out.println(str1);
		}
		else
		{
			System.out.println(str2);
		}
	}
}
