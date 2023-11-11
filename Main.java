/**
 * It is possible to place a loop inside another loop. This is called a nested loop.
 * The "inner loop" will be executed one time for each iteration of the "outer loop":
 */
public class Main {
    public static void main (String[] args) {
        // Outer loop
        for (int i = 0; i <= 2; i++) {
            System.out.println("Outer: " + i);

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j);
            }
        }
    }
}
