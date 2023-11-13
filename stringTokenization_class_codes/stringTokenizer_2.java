/*To take multiple inputs on one line
Input:
	5 shashi 1000
	6 vaibhav 900

Output: Emp_ID=5
	Emp_name=shashi
	Emp_Sal=1000
	
	Emp_ID=6
	Emp_name=vaibhav
	Emp_Sal=900
*/
import java.util.*;
import java.io.*;
class stringTokenizeDemo{

	public static void main(String[] a)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Details Id name and salary(separated by space):");
		String empDetails= br.readLine();
	
		StringTokenizer st= new StringTokenizer(empDetails," ");//delimiter is " "{space} here
	
		String token1= st.nextToken();
		String token2= st.nextToken();
		String token3= st.nextToken();

		int emp_Id=Integer.parseInt(token1);
		String emp_Name= token2;
		float emp_Sal= Float.parseFloat(token3);

		System.out.println("Emp_ID="+emp_Id);
		System.out.println("Emp_Name="+emp_Name);
		System.out.println("Emp_Salaary="+emp_Sal);	

		System.out.println("Enter Details Id name and salary(Separated by comma):");
		String emp2_details= br.readLine();
		
		StringTokenizer obj= new StringTokenizer(emp2_details,",");//Separated by comma
	
		String tk1= obj.nextToken();
		String tk2= obj.nextToken();
		String tk3= obj.nextToken();
		
		int emp_Id2=Integer.parseInt(tk1);
		String emp_Name2= tk2;
		float emp_Sal2= Float.parseFloat(tk3);
			
		System.out.println("Emp_ID="+emp_Id2);
		System.out.println("Emp_Name="+emp_Name2);
		System.out.println("Emp_Salary="+emp_Sal2);	
	}
}
