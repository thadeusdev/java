public class Main {
    public static void main (String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // For Loop
        /*
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }        
         */

        // For-Each Loop
        for (String i :cars) {
            System.out.println(i);
        }
    }
}
