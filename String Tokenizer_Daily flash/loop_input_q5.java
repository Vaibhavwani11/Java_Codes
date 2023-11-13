/*Take information of 4 students(use of loop is compulsory)
 Student info is: StudentName(String), Age(int) and marks(Double) as input from user and print it.
use string tokenizer and print count of total numbers of token accepted from StringTokenizer 
and after use delimeter as follows  
	1)" "
	2)","
	3)":"
	4)"-"
for every loop iteration change the delimiter
*/
import java.io.*;
import java.util.*;
class Info{

	public static void main(String [] args)throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<2; i++){
			
			System.out.println("Enter Delimeter: ");
			String del= br.readLine();
			
			System.out.println("Enter Name,age,marks: ");
			String studInfo=br.readLine();
			
			StringTokenizer st=new StringTokenizer(studInfo,del);

			String name= st.nextToken();
			int age= Integer.parseInt(st.nextToken());
			double marks= Double.parseDouble(st.nextToken());
		
			System.out.println("Name= "+name);
			System.out.println("Age= "+age);
			System.out.println("Marks= "+marks);
		}
	}
}
