// Tutorial: https://www.youtube.com/watch?v=4HC_WyBSDGA&t=623s

@FunctionalInterface
interface A{

    //interface having only one method is functional interface
    void show(); 

}

// class B implements A{

//     public void show(){

//         System.out.println("Hi");
//     }
// }

class Demo{

    public static void main(String[] args) {
        
        // A obj = new A(); //not allowed, cannot make obj of interface; Another class can be created to achive so.
         
        // A obj = new B(); // This is one way to call the method of an interface;
        // obj.show();      // but, we need to create a new class for this and this is not optimal approach.

        //Creating "Annonymous Inner class" to avoid creation of another class
        // A obj = new A() {
            
        //     public void show(){
        //         System.out.println("hi in Inner class");
        //     }
           
        // };

        //From java-8: Lambda function has been introduced. to avoid minimize the number of lines in anny. Inner class
        A obj1 = () -> {

                System.out.println("hi in Lambda function");
        };
        // " -> " this arrow is called as a lambda function.
        // Can only be used with @functionalInterface
        // as functionalInterface contains only 1 method, it can identify the method without name declaration.

        // you need to call the method.
        obj1.show(); 
    }
}
