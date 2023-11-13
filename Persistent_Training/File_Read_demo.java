import java.io.*;
class File_Read_demo {
    
    public static void main(String[] args) throws IOException{
        
        File file= new File("D:/Java vaibhav/Persistent_Training/demo.text");
        FileInputStream fis=null;

        try{
            fis=new FileInputStream(file);

            System.out.println("Total file size to read in bytes: "+fis.available());
            int content;

            while((content=fis.read())!= -1){

                System.out.println((char)content);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

        fis.close();
    }
}
