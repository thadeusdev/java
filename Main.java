/**
 * All Java variables must be identified with unique names.
 * These unique names are called identifiers.
 * Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
 * Note: It is recommended to use descriptive names in order to create understandable and maintainable code:
 */

public class Main {
    public static void main(String[] args){
        // Good
        int minutesPerHour = 60;

        // ok, but not so easy to understand what m actually is
        int m = 60;

        System.out.println(minutesPerHour);
        System.out.println(m);
    }
}
