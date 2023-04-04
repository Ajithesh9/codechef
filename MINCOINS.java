/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int test,money;
		Scanner sc = new Scanner(System.in);
		test = sc.nextInt();
		while(test-- >0)
		{
		    money = sc.nextInt();
		    if(money%10 == 0)
		    {
		        System.out.println(money/10);
		    }
		    else if(money%5 == 0)
		    {
		        System.out.println((money/10)+1);
		    }
		    else{
		        System.out.println("-1");
		    }
		}
	}
}
