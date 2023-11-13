/* packag`e codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    //Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

    	    // your code goes here
	    int t=0;
	    t=Integer.parseInt(br.readLine());
	    //t=sc.nextInt();
	 for(int k=0; k<t; k++){
	          
	    int n=0,a=0,b=0;
	    n=Integer.parseInt(br.readLine());
	    a=Integer.parseInt(br.readLine());
	    b=Integer.parseInt(br.readLine());
	    //n=sc.nextInt();
	    //a=sc.nextInt();
	    //b=sc.nextInt();
	         int sa=0,ab=0;
	    for(int i=0; i<n; i++){
	        
	           String s=new String();
	           s= br.readLine();
		   //  s=sc.nextLine();
	          	      
	           if(s.charAt(0)=='E'){	   
	                sa= sa+a;   
	           }
	           else
	                ab=ab+b;
	           
	    } 
	    if(sa==ab)
	        System.out.printf("DRAW\n");
	   else if(ab>sa)
	        System.out.printf("ANURADHA\n");
	    else
	        System.out.printf("SARTHAK");
	        
	 }
	}
}

