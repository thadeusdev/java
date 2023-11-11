/**
 * Type casting is when you assign a value of one primitive data type to another type.
 */

/**
 * Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double
 */

/**
 * Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte
 */

public class Main{
    public static void main(String[] args){
        int myInt = 9;
        // widening casting
        double myDouble = myInt;

        // Narrowing Casting
        double myDoubla = 9.78d;
        int myInta = (int) myDoubla;

        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myDoubla);
        System.out.println(myInta);
    }
}