/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     String str1,str2,str3;
	     int i;
	     Scanner s=new Scanner(System.in);
	     i=s.nextInt();
	     str1=s.next();
	     str2=str1.replaceAll("[aeiouAEIOU]","");
	     str3=new StringBuilder(str2).reverse().toString();
	     System.out.println(str3);
	     
	     
	}
}
