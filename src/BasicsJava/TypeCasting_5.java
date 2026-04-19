package BasicsJava;

/**
 * Type Casting means converting one datatype to another.
 * 2 types: Implicit Casting (Widening) -- Java does this automatic -- smaller datatype -> bigger datatype
 *          Explicit Casting (Narrowing) -- Java requires manual conversion -- bigger type -> smaller type
 */


public class TypeCasting_5 {
    public static void main(String[] args) {
        int num = 10;
        double value = num;

        //double can safely store int, no data loss
        System.out.println(value);


        double price = 99.99;
        int amount = (int) price;
        //decimal part is removed, possible data loss and hence java asks for permission
        System.out.println(amount);
    }
}
