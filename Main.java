/**
 * stativ method - means that it can be accessed without creating an object of the class.
 * 
 * public method - means thet it can only be accessed by objects:
 */

public class Main {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would comple an error

        Main myObj = new Main(); // Create an object of main
        myObj.myPublicMethod(); // Call the public method on the object
    }
}
