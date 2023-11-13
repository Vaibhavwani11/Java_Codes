/*
 Write a program to print table of 2
  */
import java.io.*;
import java.lang.*;
class Table{

	static int num=2;
	static int i=1;

	public static void main(String [] args){
	
		System.out.println("Table of 2:");	
		while(i<=10){
		
			System.out.println(num*i);
		i++;	
		}
	}
}
