/*
 Write a program  to accept the number from user and print it
 */
import java.io.*;
class Input{
static public void main(String [] atgs) throws IOException{

	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(isr);
	
	System.out.printf("Enter the Number:\n");
	int num= Integer.parseInt(br.readLine());
		
	System.out.printf("%d\n",num);
}
}
