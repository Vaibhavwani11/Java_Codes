import java.io.*;
class createFile {
    public static void main(String[] args) {
        
        File obj=new File("D:/Java vaibhav/File Handling");
        System.out.println(obj.getName());
        //Returns the name of the file or directory denoted by this abstract pathname. This is just the last name in the pathname's name sequence. 
        // If the pathname's name sequence is empty, then the empty string is returned.
    }
}
