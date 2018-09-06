/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
                        int n,i;
		Scanner s=new Scanner(System.in);
	            String str;
	            str=s.next();
	            n=str.length();
	            boolean flag=false;
	            char[] ch=str.toCharArray();
	            for(i=n-1;i>=0;i--)
	            {
	            	System.out.println(ch[i]);
	            }
	            
	}
}
