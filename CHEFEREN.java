/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int test;
		Scanner sc = new Scanner(System.in);
		test = sc.nextInt();
		while(test-- >0)
		{
		    int ev=0,od=0;
		    int num = sc.nextInt();
		    int even = sc.nextInt();
		    int odd = sc.nextInt();
		    for(int i = 1;i<=num;i++)
		    {
		        if(i%2==0)
		        {
		            ev++;
		        }
		        else
		        {
		            od++;
		        }
		    }
		    System.out.println((even*ev) + (odd*od));
		}
	}
}