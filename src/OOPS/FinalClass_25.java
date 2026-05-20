/**
 * ============================================================================
 * FINAL CLASS
 * ============================================================================
 * DEFINITION:
 * A class declared using the 'final' keyword cannot be inherited or extended
 * by any other class. The class implementation is fixed and cannot be modified
 * through inheritance.
 * ============================================================================
 * SYNTAX:
 * ============================================================================
 * final class ClassName {
 *     // class body
 * }
 * ============================================================================
 * WHY USE FINAL CLASSES?
 * ============================================================================
 * Mark a class as final to:
 * - Prevent inheritance and unexpected subclassing
 * - Increase security and prevent unauthorized modifications
 * - Maintain fixed behavior across the application
 * - Create immutable classes
 * - Ensure predictable implementation
 * ============================================================================
 * REAL-WORLD EXAMPLE: String CLASS
 * ============================================================================
 * The String class in Java is declared as final.
 * WHY is String final?
 * Java prevents developers from:
 * - Changing String behavior unexpectedly
 * - Breaking immutability guarantees
 * - Creating unsafe modifications
 * - Overriding critical String methods
 * This ensures all String objects behave consistently and securely.
 * ============================================================================
 * IMPORTANT RULES:
 * ============================================================================
 * RULE 1: Final Class Cannot Extend
 * - A final class cannot be extended (inheritance is blocked)
 * - Compilation error if you try to extend a final class
 * RULE 2: Final Class CAN Contain
 * - Normal methods
 * - Final methods
 * - Variables (fields)
 * - Constructors
 * - Static members
 * RULE 3: Marking Methods Final in Final Class
 * - If a class is already final, marking methods as final becomes mostly
 *   unnecessary
 * - Why? Because inheritance itself is already blocked at the class level
 * - No child class can be created anyway, so no method override is possible
 * - Exception: clarity/documentation purposes
 * ============================================================================
 */

package OOPS;

final class SecuritySystem{
    void authenticate(){
        System.out.println("Authentication successful");
    }
}

final class RBI{
    void loanRules(){
        System.out.println("Rules should be followed for loans");
    }
}
/*
class SBI extends RBI{

}--> compilation error
 */

public class FinalClass_25 {
    public static void main(String[] args) {
        SecuritySystem securitySystem = new SecuritySystem();
        securitySystem.authenticate();

        RBI rbi = new RBI();
        rbi.loanRules();
    }
}
