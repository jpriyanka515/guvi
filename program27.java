/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  char ch;
	  Scanner S=new Scanner(System.in);
	  ch=S.next().charAt(0);
	  if(ch>='0'&&ch<='9')
	  {
	  	System.out.println("yes");
	  }
	  else
	  System.out.println("No");
	}
}
