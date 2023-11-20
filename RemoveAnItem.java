/**
 * To remove an element, use the remove() method and refer to the index number:
 * 
 * To remove all the elements in the ArrayList, use the clear() method:
 */
import java.util.ArrayList;

public class RemoveAnItem {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove(0);
        cars.clear();
        System.out.println(cars);
    }
}