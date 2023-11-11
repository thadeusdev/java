/**
 * When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
 */

 // Explanation
/**
 * Statement 1 sets a variable before the loop starts (int i = 0).
 * 
 * Statement 2 defines the condition for the loop to run (i must be less than 5). If the condition is true, the loop will start over again, if it is false, the loop will end.
 * 
 * Statement 3 increases a value (i++) each time the code block in the loop has been executed.
*/

public class Main {
    public static void main (String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
