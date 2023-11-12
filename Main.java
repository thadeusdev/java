/**
 * Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared:
 */

public class Main {
    public static void main(String[] args) {

        // Code here CANNOT use x

        int x = 100;

        // Code here can use x
        System.out.println(x);
    }
}