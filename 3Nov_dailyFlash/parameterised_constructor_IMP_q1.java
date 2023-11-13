/*Que 1: Create 2 classes Employee Details and MainDemo
-> In EmployeeDetails create 4 Instance variable of your choice and initialize them in constructor.

-> In MainDemo Take 'n' number of employees from user and make the array of object of that 'n' size and
 take details of employees for 'n' employees (employee no.,employee name, contact number, address) 
 from user using BufferedReader class.
 
 Initialize this values using constructor in EmployeeDetalls for
 'n' number of employees, 
 ->Display all data in following appropriate format.
-->Also draw the JVM architecture for this program

Output:
Enter the number of employees :
	1
  Enter the details for employee-1 
  Enter EmpNo: 101
  Enter Contact:
*/
import java.io.*;
import java.util.*;
class EmployeeDetails{
	
	EmployeeDetails(String name,int empNo,long contactNo){

		System.out.println("Emp Name= "+name);
		System.out.println("Emp No.= "+empNo);
		System.out.println("Emp No.= "+contactNo);
	}
}
class MainDemo{

	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter Number of employee: ");
		int emp=Integer.parseInt(br.readLine());
		
		for(int i=0; i<emp; i++){
		
			System.out.println("Enter Name,id & Contact of employee: ");

			String line=br.readLine();
			StringTokenizer st=new StringTokenizer(line," ");
			
			EmployeeDetails obj=new EmployeeDetails(st.nextToken(),Integer.parseInt(st.nextToken()),Long.parseLong(st.nextToken()));	
		}
	}
}
