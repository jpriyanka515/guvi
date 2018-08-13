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
		int i,n,num=0,ch=0,spc=0;
		Scanner S=new Scanner(System.in);
		str=S.nextLine();
		n=str.length();
		for(i=0;i<n;i++)
		{
			if((str.charAt(i)>='0'&&str.charAt(i)<='9'))
			{ 
				num++;
			}
else if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
			{ 
				ch++;
			}
			else
			{
				spc++;
			}
		}
		System.out.println(spc);
	}
}
