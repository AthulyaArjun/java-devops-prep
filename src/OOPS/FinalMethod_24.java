/**
 * ============================================================================
 * FINAL METHOD
 * ============================================================================
 * DEFINITION:
 * A method declared using the 'final' keyword cannot be overridden by child
 * classes. Once defined, its implementation is fixed and immutable.
 * ============================================================================
 * SYNTAX:
 * ============================================================================
 * final <return-type> <method-name>(<parameters>) {
 *     // method body
 * }
 * Example: final void show() {}
 * ============================================================================
 * WHY USE FINAL METHODS?
 * ============================================================================
 * When a parent class has critical methods that should not be modified by
 * child classes, mark them as final to:
 * - Protect critical logic and business rules
 * - Maintain fixed and consistent behavior
 * - Improve security and prevent unauthorized changes
 * - Avoid accidental modification or unintended overrides
 * ============================================================================
 * RULES & CHARACTERISTICS:
 * ============================================================================
 * 1. Final method CAN be inherited by child classes
 *    (inherited as-is, but cannot be overridden)
 * 2. Final method CANNOT be overridden, but CAN be overloaded
 *    (overloading = multiple methods with same name, different parameters)
 * 3. Final and Abstract Together = INVALID
 *    abstract → implies method MUST be overridden by child class
 *    final → implies method CANNOT be overridden
 *    (These are contradictory concepts)
 * ============================================================================
 */

package OOPS;

class Government{
    final void rules(){
        System.out.println("National Government Rules");
    }

    void party(){
        System.out.println("Winning party runs government");
    }
}

class State extends Government{
//    @Override
//    void rules(){
//        System.out.println("Inside child"); -->compilation error
//    }

    @Override
    void party(){
        super.party();
        System.out.println("Inside child");
    }

}
public class FinalMethod_24 {
    public static void main(String[] args) {

        Government government = new State();
        government.rules();
        government.party();
    }
}
