/**
 * Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
 * 
 * To declare an array, define the variable type with square brackets:
 */

public class Main {
    public static void main (String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        System.out.println(cars[0]);
        System.out.println(cars.length);
    }
}
