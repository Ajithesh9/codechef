/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num%4 == 0)
		{
		  num++;
		}
		else
		{
		  num--;
		}
		 System.out.println(num);
		}
}
