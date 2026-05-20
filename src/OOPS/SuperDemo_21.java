/**
 * ════════════════════════════════════════════════════════════════════════════
 * SUPER - Parent Class Reference
 * ════════════════════════════════════════════════════════════════════════════
 * Definition:
 *   super → reference to immediate parent class object
 *   this  → reference to current object

 * Purpose: Access parent class members when there's a naming conflict

 * ────────────────────────────────────────────────────────────────────────────
 * When to Use super:
 * ────────────────────────────────────────────────────────────────────────────
 *   • Accessing parent variables (when overridden in child)
 *   • Calling parent methods (when overridden in child)
 *   • Calling parent constructor (when child needs custom initialization)
 * ════════════════════════════════════════════════════════════════════════════
 * ============================================================================
 * SUPER() KEYWORD - Detailed Explanation
 * ============================================================================

 * ────────────────────────────────────────────────────────────────────────────
 * 1. AUTOMATIC super() INSERTION
 * ────────────────────────────────────────────────────────────────────────────
 * When child constructor is called, Java AUTOMATICALLY inserts super() IF:
 *   • Parent class has a DEFAULT (no-argument) constructor
 *   • Child constructor does NOT explicitly call any constructor
 * ────────────────────────────────────────────────────────────────────────────
 * 2. EXAMPLE: Automatic super() Insertion
 * ────────────────────────────────────────────────────────────────────────────
 * Original Code Written:
    class Parent {
        Parent() {
            System.out.println("Parent Constructor");
        }
    }

    class Child extends Parent {
        Child() {
            System.out.println("Child Constructor");
        }
    }

 * What Java Internally Does:

    class Child extends Parent {
        Child() {
            super();  // ← AUTOMATICALLY ADDED
            System.out.println("Child Constructor");
        }
    }

 * Output:
 *   Parent Constructor
 *   Child Constructor

 * ────────────────────────────────────────────────────────────────────────────
 * 3. WHY super() IS NEEDED - INITIALIZATION ORDER
 * ────────────────────────────────────────────────────────────────────────────
 * Parent object initialization MUST happen before child object initialization.
 * Object Creation Flow:
 *   1. Memory allocated
 *   2. Parent constructor executes (initialization of parent part)
 *   3. Child constructor executes (initialization of child part)

 * Real Example:
 *   MyDog dog = new MyDog();
 *   Execution Order:
 *   ↓ Memory allocated
 *   ↓ MyAnimal() constructor runs first
 *   ↓ MyDog() constructor runs next
 * ────────────────────────────────────────────────────────────────────────────
 * 4. PROBLEM: Parent Constructor with Parameters
 * ────────────────────────────────────────────────────────────────────────────
 * If parent class does NOT have a default constructor:
    class Parent {
        Parent(int x) {  // Only parameterized, NO default constructor
            System.out.println(x);
        }
    }

    class Child extends Parent {
        Child() {
            System.out.println("Child");  // ❌ COMPILATION ERROR!
        }
    }

 * Why Error?
 *   → Java tries to insert super()
 *   → But parent has NO default constructor
 *   → Cannot proceed without explicit super(arguments)

 * ────────────────────────────────────────────────────────────────────────────
 * 5. SOLUTION: Explicit super() with Arguments
 * ────────────────────────────────────────────────────────────────────────────
 * Must explicitly call parent constructor with matching arguments:
   class Parent {
        Parent(int x) {
            System.out.println(x);
        }
    }

    class Child extends Parent {
        Child() {
            super(10);  // ← Explicit super() with arguments
            System.out.println("Child");
        }
    }

 * Rule: If parent constructor requires parameters,
 *       child MUST explicitly call super(arguments) with same parameter types.
 * ────────────────────────────────────────────────────────────────────────────
 * 6. INTERACTION WITH this() - IMPORTANT RULE
 * ────────────────────────────────────────────────────────────────────────────
 * If child constructor uses this() (constructor chaining):
 *   → Java does NOT automatically insert super()
 *   → The called constructor (via this()) is responsible for super()
 *   → Both super() and this() CANNOT exist together in same constructor
 *     (both must be first statement, only one can be first)
 * ────────────────────────────────────────────────────────────────────────────
 * 7. KEY TAKEAWAYS
 * ────────────────────────────────────────────────────────────────────────────
 * ✓ Parent constructor ALWAYS executes before child constructor
 * ✓ super() is either AUTO-inserted or EXPLICITLY called
 * ✓ Automatic super() works ONLY IF parent has default constructor
 * ✓ If parent has parameterized constructor, explicit super(args) is required
 * ✓ super() must be the FIRST statement in child constructor
 * ✓ this() and super() cannot coexist in the same constructor
 * ============================================================================
 */
package OOPS;

class MyAnimal {
    String color = "White";
}

class MyDog extends MyAnimal {
    String color = "Black";
    void printColor() {
        System.out.println("Dog Color : " + this.color);
        System.out.println("Animal Color : " + super.color);
    }
}

public class SuperDemo_21 {
    public static void main(String[] args) {
        MyDog dog = new MyDog();
        dog.printColor();
    }
}

/**
 * ════════════════════════════════════════════════════════════════════════════
 * FREQUENTLY ASKED QUESTIONS (FAQs)
 * ════════════════════════════════════════════════════════════════════════════
 * Q1: Is super() always automatically inserted?
 * A:  No. Only if:
 *     • Parent class has a default constructor
 *     • Child constructor doesn't explicitly call this() or super()

 * Q2: Can super() and this() exist together in one constructor?
 * A:  No. Both need to be the FIRST statement.
 *     Only one can be first, so they cannot coexist.

 * ════════════════════════════════════════════════════════════════════════════
 */