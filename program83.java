/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n1,n2,c;
		char ch;
		Scanner s=new Scanner(System.in);
		n1=s.nextInt();
		ch=s.next().charAt(0);
		n2=s.nextInt();
		switch(ch)
		{
			case '/':
				       c=n1/n2;
				       System.out.println(c);
				       break;
            case '%':
            	      c=n1%n2;
            	      System.out.println(c);
            	      break;
		}
		
	}
}
