/**
 * ═════════════════════════════════════════════════════════════════════════════
 *                           OBJECT CLASS IN JAVA
 * ═════════════════════════════════════════════════════════════════════════════

 * ► DEFINITION:
 *   Every class in Java directly or indirectly inherits from the Object class.
 *   No class can exist without the Object class as a parent.

 *   Example:
 *   --------
 *   When you write:
 *       class Student { }

 *   Internally, Java automatically converts it to:
 *       class Student extends Object { }

 * ═════════════════════════════════════════════════════════════════════════════
 * ► AUTOMATIC INHERITANCE:
 *   Every class automatically inherits methods from Object:
 *   • toString()   - String representation
 *   • equals()     - Object comparison
 *   • hashCode()   - Hash value generation
 *   • getClass()   - Runtime class information
 *   • notify()     - Thread notification
 *   • wait()       - Thread waiting

 * ═════════════════════════════════════════════════════════════════════════════
 * ► WHY IS OBJECT CLASS IMPORTANT?
 *   1. Universal Parent: Java treats all objects through this parent class
 *   2. Polymorphism: Object obj = new Student(); is valid (Student IS-A Object)
 *   3. Foundation: Root of polymorphism, collections, framework design
 *   4. Generic Programming: Enables type flexibility and reusability

 * ═════════════════════════════════════════════════════════════════════════════
 */

package OOPS;

class Infosys{

}

public class ObjectClass_26 {
    public static void main(String[] args) {
        Infosys infosys = new Infosys();

        System.out.println(infosys.toString()); // --> OOPS.Infosys@1b28cdfa
        System.out.println(infosys);
        System.out.println(infosys.getClass());
    }
}

/*
 * ═════════════════════════════════════════════════════════════════════════════
 *                         OUTPUT EXPLANATION
 * ═════════════════════════════════════════════════════════════════════════════

 * Sample Output: OOPS.Infosys@1b28cdfa

 * Format Breakdown:
 * ├─ OOPS.Infosys  ──> Fully qualified class name
 * └─ 1b28cdfa      ──> Hexadecimal hash code (memory reference)

 * Why this format?
 * The default toString() method from Object class returns:
 *     className@HexadecimalHashcode

 * ═════════════════════════════════════════════════════════════════════════════
 *                    MAIN OBJECT CLASS METHODS
 * ═════════════════════════════════════════════════════════════════════════════

 * | Method      | Purpose                           |
 * |─────────────|─────────────────────────────────|
 * | toString()  | Convert object to readable string |
 * | equals()    | Compare objects for equality      |
 * | hashCode()  | Generate unique hash value        |
 * | getClass()  | Get runtime class information     |
 * | clone()     | Create a copy of object           |
 * | notify()    | Notify waiting threads            |
 * | wait()      | Make thread wait                  |
 *
 * ═════════════════════════════════════════════════════════════════════════════
 */