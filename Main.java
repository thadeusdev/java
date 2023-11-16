/**
 * An enum - is a special "class" that represents a group of constants (unchangeable variables, like "final" variables).
 */

enum Level {
    LOW,
    MEDIUM,
    HIGH
}

// You can access enum constants with the dot syntax:
public class Main {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}
