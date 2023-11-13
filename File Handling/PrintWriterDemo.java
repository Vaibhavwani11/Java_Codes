import java.io.*;
class Demo{

    public static void main(String [] a){

        try{
        PrintWriter writer=new PrintWriter(System.out);
        writer.write(64+'2');
        writer.close();
        }
        catch(Exception e){

            System.out.println(e);
        }
    }

}