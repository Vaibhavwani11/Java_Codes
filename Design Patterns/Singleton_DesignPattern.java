class ABC{

    private ABC(){

    }
    static ABC obj = new ABC();

    
    // Private constructor to prevent instantiation from other classes
    public static ABC getInstance(){
        
        return obj;
    }

}

class Singleton_DesignPattern {

    public static void main(String[] args) {

        // ABC obj = new ABC(); Cannot create object outside the class, as the constructor is private.

        // to get Object of the class:
        ABC obj1= ABC.getInstance();
    }
}
// Why private variable is created instead of creating the instance in getInstance method?
// By using the private static instance variable, you achieve the following benefits:
// Lazy Initialization: The instance is created only when it is actually needed, which can help improve performance and reduce memory usage.
// Thread Safety: In a multi-threaded environment, having a static instance variable ensures that only one instance is created, even in concurrent scenarios, thanks to the atomicity of class loading and static variable initialization.
// Global Access: The instance variable can be accessed globally within the class and from the getInstance() method, making it accessible from anywhere in the code where the Singleton class is used.