/**
 * values() method - returns an array of all enum constants. This method is useful when you want to loop through the constants of an enum:
 */

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Main {
    public static void main(String[] args) {
        for (Level myVar : Level.values()) {
            System.out.println(myVar);
        }
    }
}
