//trim is used to remove whitespaces
import java.util.*;
import java.io.*;
class trimDemo{

	public static void main(String [] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Details Id name and salary(Separated by comma):");
		String emp_details= br.readLine();
		
		StringTokenizer obj= new StringTokenizer(emp_details,",");//Separated by comma
	
		String tk1= obj.nextToken().trim();
		String tk2= obj.nextToken().trim();
		String tk3= obj.nextToken().trim();
		
		int emp_Id2=Integer.parseInt(tk1);
		String emp_Name2= tk2;
		float emp_Sal2= Float.parseFloat(tk3);
			
		System.out.println("Emp_ID="+emp_Id2);
		System.out.println("Emp_Name="+emp_Name2);
		System.out.println("Emp_Salary="+emp_Sal2);	
	}
}
