/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double A,X,B,Y,test;
		Scanner sc = new Scanner(System.in);
		test = sc.nextInt();
		while (test-- > 0)
		{
		    A = sc.nextInt();
		    X = sc.nextInt();
		    B = sc.nextInt();
		    Y = sc.nextInt();
		    if(A/X > B/Y)
		    {
		        System.out.println("Alice");
		    }
		    else if(A/X == B/Y)
		    {
		        System.out.println("equal");
		    }
		    else
		    {
		        System.out.println("BOB");
		    }
		}
		}
}
