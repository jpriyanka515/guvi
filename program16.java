/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{

        int low , high;
        Scanner S=new Scanner(System.in);
        low=S.nextInt();
        high=S.nextInt();
        while (low < high) 
        {
            boolean flag = false;

            for(int i = 2; i <= low/2; ++i)
       {
                if(low % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.print(low + " ");

            ++low;
        }
    }
}
