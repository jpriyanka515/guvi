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
		int word=0,ch=0,i,n,spc=0;
		Scanner S=new Scanner(System.in);
		str=S.nextLine();
		n=str.length();
		for(i=0;i<n;i++)
		{
			if(str.charAt(i)!=' ')
			{
		
		              ch++;
			}
			else
			{
				spc++;
		          word++;
			}
		}
		System.out.println(spc);
		
		
	}
}
