/*Program 4:
Write a Java Program for login window.
Write one class, define hardcoded username & password.
Then write one parameterized constructor in class to take username & password
& match that credentials with the hardcoded values 
if value matches, print "Login Successful!" Otherwise print "Invalid User!".*/
import java.io.*;
class loginWindow{

	String userName= new String("Vaibhav");
	int password= 2770;

	loginWindow(String userName,int password){

		System.out.println("ori= "+this.userName);
		System.out.println("ori pwd= "+this.password);
		System.out.println("passed= "+userName);
		System.out.println("passed pwd= "+password);
		
		System.out.println(this.userName==userName);
		System.out.println(this.password==password);
		
		if(this.userName==userName && this.password==password)
			System.out.println("Login Successful!");
		else
			System.out.println("Invalid User!");

	}
	public static void main(String [] args) throws IOException{
	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Username and Password: ");
		loginWindow obj=new loginWindow(br.readLine(),Integer.parseInt(br.readLine()));
	}
}
