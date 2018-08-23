/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int h1,m1,h2,m2,h3,m3,h4,m4,h5,m5,m6;
		Scanner S=new Scanner(System.in);
		h1=S.nextInt();
		m1=S.nextInt();
		h2=S.nextInt();
		m2=S.nextInt();
		h3=h1*60;
		m3=h3+m1;
		h4=h2*60;
		m4=h4+m2;
		m5=m3-m4;
		h5=m5/60;
		m6=m5%60;
		System.out.println(h5+" "+m6);
		
	}
}
