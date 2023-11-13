import java.util.*;
class ConcatMethod{

    public static void main(String [] args){

        String str1="Vaibhav";
        String str2=new String("Wani");

        System.out.println(str1.concat(str2));

        String ans =myConcat(str1,str2);        
        System.out.println(ans);

    }  
    static String myConcat(String str1, String str2){

        char s1[]= str1.toCharArray();
      //  System.out.println(Arrays.toString(s1));
        
        char s2[]= str2.toCharArray();
      //  System.out.println(Arrays.toString(s2));

        int len= str1.length() + str2.length();
        
        char ans[]=new char[len];
        for(int i=0; i<s1.length; i++){

            ans[i]= s1[i];
        }
        int j=0;
        for(int i=s1.length; i<len; i++){

            ans[i]=s2[j];
            j++;
        }
        
        StringBuffer sb= new StringBuffer();
        for(int i=0; i<ans.length; i++){
            sb.append(ans[i]);
        }
        String ansStr= sb.toString();
        return ansStr;
    }
}