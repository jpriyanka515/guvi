	/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String player1,player2;
		int ch1,ch2;
		Scanner S=new Scanner(System.in);
		player1=S.next();
		player2=S.next();
		System.out.println("enter 1for rock,2 for paper,3 for scissor");
		System.out.println("enter player1 choice");
		ch1=S.nextInt();
		System.out.println("enter player2 choice");
		ch2=S.nextInt();
	            if(ch1==1 && ch2==2)
		{
		System.out.println(player2+"wins");	
		}
		else if(ch1==1 && ch2==3)
		{
			System.out.println(player1+"wins");
		}
		else if(ch1==2 && ch2==3)
		{
			System.out.println(player2+"wins");
		}
		else if(ch1==2 && ch2==1)
		{
			System.out.println(player1+"wins");
		}
		else if(ch1==3 && ch2==1)
		{
			System.out.println(player2+"wins");
		}
		else if(ch1==3 && ch2==2)
		{
			System.out.println(player1+"wins");
		}
		else
		System.out.println("tie or draw");
	}
}
