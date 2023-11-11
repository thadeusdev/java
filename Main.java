/**
 * Use the if statement to specify a block of Java code to be executed if a condition is true.
 * 
 * Use the else statement to specify a block of code to be executed if the condition is false
 * 
 * Use the else if statement to specify a new condition if the first condition is false.
 */

public class Main {
    public static void main(String[] args){
        int time = 22;
        if (time < 10){
            System.out.println("Good morining.");
        }else if (time < 18){
            System.out.println("Good day.");
        }else {
            System.out.println("Good evening.");
        }
    }
}
