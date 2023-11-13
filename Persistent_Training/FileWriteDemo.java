import java.io.*;
class FileWriteDemo {
    public static void main(String[] args) {

        File file=new File("D:/Java vaibhav/Persistent_Training/Reference_file.txt");
        
        FileInputStream fis=null;
        FileOutputStream fout=null;

        try{
            fis =new FileInputStream(file);
            fout =new FileOutputStream("D:/Java vaibhav/Persistent_Training/Copied_file.txt");
            
            int content;

            while( (content=fis.read()) != -1 ){
                
                fout.write(content);
            }
            System.out.println("File copied Successfully!");
        }
        catch(IOException e){
            e.printStackTrace();
        }
        fis.close();
        fout.close();
    }
}
