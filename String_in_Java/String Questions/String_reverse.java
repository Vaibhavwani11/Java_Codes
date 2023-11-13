class Reverse{

    public static void main(String [] args){

        String s1="Vaibhav";

        System.out.println(reverse(s1));
        reverse2(s1);
    }
    static String reverse(String s1){

        String rev="";
        for(int i=s1.length()-1; i>=0; i--){

            rev=rev+ s1.charAt(i);
        }

        return rev;
    }
    static void reverse2(String s1){

        char arr[]=s1.toCharArray();

        for(int i=arr.length-1; i>=0; i--){

            System.out.print(arr[i]);
        }
    }
    
}