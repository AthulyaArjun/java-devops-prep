/**
 * ============================================================================
 * BLANK FINAL VARIABLE
 * ============================================================================
 * DEFINITION:
 * A final variable that is declared but NOT initialized immediately is called
 * a Blank Final Variable. It must be initialized exactly once, typically in
 * the constructor.
 * ============================================================================
 * WHY USE BLANK FINAL VARIABLES?
 * ============================================================================
 * When a value is NOT known immediately at declaration time, blank final
 * variables provide a way to delay initialization while still maintaining
 * immutability (final behavior).
 * ============================================================================
 * REAL-WORLD EXAMPLES:
 * ============================================================================
 * - Student roll number: received during object creation
 * - Account number: generated later based on business logic
 * - Employee ID: assigned through constructor
 * - System configuration: loaded at runtime
 * ============================================================================
 * KEY RULES:
 * ============================================================================
 * 1. Must initialize exactly ONCE (no reassignment allowed)
 * 2. Typically initialized inside the constructor
 * 3. Can be initialized in instance initializer block
 * 4. Cannot be left uninitialized after object creation
 * ============================================================================
 */

package OOPS;

class FinalDemo{
    final int empId;

    FinalDemo(int empId){
        this.empId = empId;
        System.out.println("Employee id: "+empId);
    }
}

public class BlankFinalVariable_23 {
    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo(101);

    }
}
