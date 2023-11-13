class substring_from_String {
   
    public static void main(String [] args){

        String str1="Vaibhav";
        System.out.println(str1.substring(3));
        System.out.println(str1.substring(3,5));

        System.out.println(getSubstring(str1,3));
        System.out.println(getSubstring(str1,3,5));

        System.out.println(getSubstring2(str1,3));
    }
    static String getSubstring(String s1,int beginIndex){

        String substr="";
        for(int i=beginIndex; i<s1.length(); i++){

            substr=substr+s1.charAt(i);
        }
        return substr;
    }
    static String getSubstring(String s1,int beginIndex,int lastIndex){

        String substr="";
        for(int i=beginIndex; i<lastIndex; i++){

            substr=substr+s1.charAt(i);
        }
        return substr;
    }
    static String getSubstring2(String s1,int beginIndex){

        char arr[]= s1.toCharArray();

        String substr="";
        for(int i=beginIndex; i<arr.length; i++){

            substr= substr+ arr[i];
        }
        return substr;
    }  
}
