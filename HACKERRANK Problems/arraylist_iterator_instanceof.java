/*
In this problem you need to complete a method func. The method takes an ArrayList as input. In that ArrayList there is one or more integer numbers, then there is a special string "###", after that there are one or more other strings. A sample ArrayList may look like this:

element[0]=>42
element[1]=>10
element[2]=>"###"
element[3]=>"Hello"
element[4]=>"Java"
You have to modify the func method by editing at most 2 lines so that the code only prints the elements after the special string "###". For the sample above the output will be:

Hello
Java */import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        ArrayList al=new ArrayList();

        int n=sc.nextInt();
        int m=sc.nextInt();

        for(int i=0; i<n ;i++){
            
            al.add(sc.nextInt());
        }
        al.add("###");
        for(int i=0; i<m ;i++){
            
            al.add(sc.next());
        }
        Iterator itr=func(al);
        
        while(itr.hasNext()){
            
            System.out.println(itr.next());
        }
    }
    static Iterator func(ArrayList al){
        
        Iterator itr= al.iterator();
        
        while(itr.hasNext()){
            
            Object element= itr.next();
            if(element instanceof String){
                    
                    break; //now itr pointer is at "###"                    
            }
        }
    return itr;
    }
}

