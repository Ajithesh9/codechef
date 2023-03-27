/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int test ,X,Y,D;
		Scanner sc = new Scanner(System.in);
		test = sc.nextInt();
		while(test-- >0)
		{
		    X= sc.nextInt();
		    Y= sc.nextInt();
		    D= sc.nextInt();
		    if(Math.abs(X-Y) <=D)
		    
		    {
		        System.out.println("Yes");
		    }
		    else{
		        System.out.println("No");
		    }
		}
	}
}
