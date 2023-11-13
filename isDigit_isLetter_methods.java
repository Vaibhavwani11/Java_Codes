class isDigit_isLetter_methods {
    public static void main(String[] args) {

        int x=10;
        char ch='A';

        System.out.println(Character.isDigit(x));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.getType(x));
        System.out.println(Character.getType(ch));

        System.out.println(Character.isLetter(x));
        System.out.println(Character.isLetter(ch));
    }
}
