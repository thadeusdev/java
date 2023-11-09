/**
 * The println() method is often used to display variables.
 * To combine both text and a variable, use the + character. 
 * You can also use the + character to add a variable to another variable.
 * For numeric values, the + character works as a mathematical operator (notice that we use int (integer) variables here):
 */

public class Main{
    public static void main(String[] args){
        String name = "John";

        String FirstName = "John";
        String lastName = "Doe";
        String fullName = FirstName + " " + lastName;

        int x = 5;
        int y = 6;
        
        System.out.println("Hello " + name);
        System.out.println(fullName);
        System.out.println(x + y);
    }
}