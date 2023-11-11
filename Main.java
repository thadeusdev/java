/**
 * A boolean type is declared with the boolean keyword and can only take the values true or false:
 */

public class Main {
    public static void main(String[] args){
        boolean isJavaFun = true;
        boolean isFishTasty = false;

        // real life application
        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge){
            System.out.println("Old enough to vote!");
        }else{
            System.out.println("Not old enough to vote.");
        }

        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
    }    
}
