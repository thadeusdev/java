/**
 * A multidimensional array is an array of arrays.
 * 
 * Multidimensional arrays are useful when you want to store data as a tabular form, like a table with rows and columns.
 */

public class Main {
    public static void main (String[] args){
       int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};

       // Loop Through Multidimensional Array
        for (int i = 0; i < myNumbers.length; ++i){
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
       System.out.println(myNumbers[1][2]); 
    }
    
}
