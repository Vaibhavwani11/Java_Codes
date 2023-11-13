//Taking Integer as Input from user
import java.io.*;
class InputDemo{

	public static void main(String [] args) throws IOException{
	

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int num1= Integer.parseInt(br.readLine());
		System.out.println(num1);//10

		int num2= Integer.parseInt(br.readLine());
		System.out.println(num2);//20
		
		System.out.println(num1+num2);//30
	}
}
