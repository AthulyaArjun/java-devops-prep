/**
 * ==========================================================
 *                     GENERICS IN JAVA
 * ==========================================================
 * Definition:
 * Generics allow classes, methods, and collections to work with specific datatypes while providing type safety.
 * Generics were introduced in Java 5.
 * Syntax:
 * <T>
 * Example:
 * ArrayList<String> names = new ArrayList<>();
 * Here:
 * String = datatype allowed inside ArrayList
 * ----------------------------------------------------------
 * WHY GENERICS?
 * ----------------------------------------------------------
 * Without Generics:
 * ArrayList list = new ArrayList();
 * list.add("Athulya");
 * list.add(100);
 * list.add(true);
 * Problem:
 * Different datatypes can be added.
 * May cause ClassCastException at runtime.

 * With Generics:
 * ArrayList<String> names = new ArrayList<>();
 * names.add("Athulya");
 * names.add(100);     // Compile Time Error
 * Advantage:
 * Only String values can be stored.
 * ----------------------------------------------------------
 * ADVANTAGES OF GENERICS
 * ----------------------------------------------------------
 * 1. Type Safety
 *    Prevents wrong datatype insertion.
 * 2. Compile-Time Checking
 *    Errors are caught during compilation.
 * 3. Avoids ClassCastException
 *    No unnecessary casting required.
 * 4. Code Reusability
 *    Same class/method can work with different datatypes.
 * ----------------------------------------------------------
 * GENERICS IN COLLECTIONS
 * ----------------------------------------------------------
 * ArrayList<String> names = new ArrayList<>();
 * ArrayList<Integer> marks = new ArrayList<>();
 * HashSet<Integer> numbers = new HashSet<>();
 * HashMap<Integer, String> students = new HashMap<>();
 * Queue<String> queue = new LinkedList<>();
 * PriorityQueue<Integer> pq = new PriorityQueue<>();
 * ----------------------------------------------------------
 * COMMON GENERIC NAMING CONVENTIONS
 * ----------------------------------------------------------
 * T = Type
 * E = Element
 * K = Key
 * V = Value
 * N = Number
 * Example:
 * HashMap<Integer, String>
 * K = Integer
 * V = String
 * ----------------------------------------------------------
 * GENERIC CLASS
 * ----------------------------------------------------------
 * A Generic Class can work with different datatypes.
 * Usage:
 * Box<String> nameBox = new Box<>();
 * nameBox.setItem("Athulya");
 * Box<Integer> markBox = new Box<>();
 * markBox.setItem(95);
 * Same class.
 * Different datatypes.
 * ----------------------------------------------------------
 * GENERIC METHOD
 * ----------------------------------------------------------
 * Output:
 * Athulya
 * 100
 * true
 * ----------------------------------------------------------
 * GENERICS VS NON-GENERICS
 * ----------------------------------------------------------
 * Non-Generic:
 * ArrayList list = new ArrayList();
 * Generic:
 * ArrayList<String> list = new ArrayList<>();
 * Generic version is preferred because:
 * - Safer
 * - Cleaner
 * - Easier to maintain
 * ----------------------------------------------------------
 * INTERVIEW QUESTIONS
 * ----------------------------------------------------------
 * Q1. What are Generics?
 * Ans:Generics allow classes, methods and collections to work with specific datatypes while ensuring type safety.

 * Q2. Why were Generics introduced?
 * Ans: To provide type safety and avoid ClassCastException.

 * Q3. What does T represent?
 * Ans:T stands for Type.

 * Q4. Name some common Generic symbols.
 * Ans:T, E, K, V, N

 * Q5. Give a real example of Generics.
 * ArrayList<String>
 * HashMap<Integer, String>

 * Q6. What is the biggest advantage of Generics?
 * Ans:Type Safety.
 * ==========================================================
 * END OF GENERICS
 * ==========================================================
 */


package Generics;


class Box<T> {

    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
public class IntroToGenerics_1 {
    public static <T> void printData(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {

        printData("Athulya");
        printData(100);
        printData(true);

        Box<String> nameBox = new Box<>();
        nameBox.setItem("Athulya");
        Box<Integer> markBox = new Box<>();
        markBox.setItem(95);
        System.out.println(nameBox.getItem());
        System.out.println(markBox.getItem());
    }
}
