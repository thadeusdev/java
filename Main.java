/**
 * inner class can be "private" or "protected".
 * If you don't want outside objects to access the inner class, declare the class as private:
 */

class OuterClass {
    int x = 10;

    private class InnerClass {
        int y = 5;
    }
}

public class Main {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();  // If you try to access a private inner class from an outside class, an error occurs:

        System.out.println(myInner.y + myOuter.x);
    }
}
