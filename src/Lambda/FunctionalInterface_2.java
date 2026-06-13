/**
 * A functional interface is an interface that contains exactly one abstract method
 * eg: Runnable interface
 * public interface Runnable{
 *     void run();
 * }
 * Runnable has only one abstract method, so Runnable is a Functional Interface

 * The lambda must match the method signature of the functional interface:
 * Parameters must match
 * Return type must match
 */

package Lambda;

@FunctionalInterface
interface Calculator{
    int add(int a, int b);
}
public class FunctionalInterface_2 {
    public static void main(String[] args) {
        Calculator calculator = (a,b) -> a+b;
        
        System.out.print(calculator.add(10,20));
        
    }
}
