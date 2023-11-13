import java.util.*;
public class Anagram_String {

    public static void main(String [] args){

        String str1="shashi";
        String str2="ashish";

        System.out.println(checkAnagram(str1,str2));
    }
    static boolean checkAnagram(String str1,String str2){

        if(str1.length()==str2.length()){

            char s1[]=str1.toCharArray();
            char s2[]=str2.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);
            
            str1=Arrays.toString(s1);
            str2=Arrays.toString(s2);
           
            if(str1.equals(str2)){

                return true;
            }
        }
        return false;
    }
}
