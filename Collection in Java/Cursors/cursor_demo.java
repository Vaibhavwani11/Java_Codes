import java.net.SocketPermission;
import java.util.ArrayList;

import jdk.javadoc.internal.tool.Main;
import jdk.vm.ci.sparc.SPARC;

import java.util.*;
class CursorDemo{
    
    public static void main(String [] args){

        ArrayList al= new ArrayList();
        al.add("Vaibhav");
        al.add("Sinhgad");
        al.add("PICT");
        al.add(100);

        System.out.println(al); //[Vaibhav,Sinhgad,PICT,1000]
        //Here to access elements one by one or by their name..cursor is required.
    }
}