/*
 * ═════════════════════════════════════════════════════════════════════════════
 *                          equals() METHOD
 * ═════════════════════════════════════════════════════════════════════════════
 *
 * ► DEFINITION:
 *   equals() is an important method from the Object class used to compare
 *   two objects for equality.
 *
 * ═════════════════════════════════════════════════════════════════════════════
 * ► THE PROBLEM WITH == OPERATOR:
 *
 *   Example:
 *   --------
 *   class Student {
 *       int id;
 *       String name;
 *
 *       Student(int id, String name) {
 *           this.id = id;
 *           this.name = name;
 *       }
 *   }
 *
 *   Student s1 = new Student(101, "Athulya");
 *   Student s2 = new Student(101, "Athulya");
 *
 *   System.out.println(s1 == s2);  // Output: false
 *
 *   Problem:
 *   --------
 *   Even though both objects have identical data, == returns false!
 *
 *   Why?
 *   The == operator compares MEMORY REFERENCES, not actual data.
 *   s1 and s2 are stored in different memory locations, so == returns false.
 *
 * ═════════════════════════════════════════════════════════════════════════════
 * ► WHY OVERRIDE equals()?
 *   To compare the ACTUAL DATA of objects instead of their memory references.
 *   This allows meaningful object comparison.
 *
 * ═════════════════════════════════════════════════════════════════════════════
 * ► SYNTAX - HOW TO OVERRIDE:
 *
 *   @Override
 *   public boolean equals(Object obj) {
 *       // Comparison logic here
 *       return true/false;
 *   }
 *
 *   ⓘ IMPORTANT RULE: Return type must always be boolean
 *
 * ═════════════════════════════════════════════════════════════════════════════
 * ► BEST PRACTICES WHEN OVERRIDING:
 *   • Check if obj is an instance of the same class
 *   • Compare all relevant fields
 *   • Use .equals() for String and object comparison
 *   • Use == for primitive types
 *
 * ═════════════════════════════════════════════════════════════════════════════
 */

package OOPS;

class Avengers{
    int id;
    String name;
    String power;

    Avengers(int id, String name, String power){
        this.id = id;
        this.name = name;
        this.power = power;
    }

    @Override
    public boolean equals(Object obj){
        Avengers avengers = (Avengers) obj;
        return this.id == avengers.id && this.name.equals(avengers.name) && this.power.equals(avengers.power);
    }
}

public class Equals_29 {
    public static void main(String[] args) {

        Avengers avenger1 = new Avengers(101,"Thor","Lightning");
        Avengers avenger2 = new Avengers(101,"Thor","Lightning");

        System.out.println(avenger1.equals(avenger2));
    }
}
/*
 * ═════════════════════════════════════════════════════════════════════════════
 *           STEP-BY-STEP BREAKDOWN OF OVERRIDDEN equals() METHOD
 * ═════════════════════════════════════════════════════════════════════════════
 *
 * Method Signature:
 * ─────────────────
 *   @Override
 *   public boolean equals(Object obj)
 *
 *   ├─ @Override    ──> Indicates we're overriding a parent class method
 *   ├─ public       ──> Accessible from anywhere
 *   ├─ boolean      ──> Returns true or false
 *   └─ Object obj   ──> Parameter (any object can be compared)
 *
 * ═════════════════════════════════════════════════════════════════════════════
 * STEP 1: Type Casting
 * ────────────────────
 *   Avengers avengers = (Avengers) obj;
 *
 *   Why?
 *   • The parameter 'obj' is of type Object (parent class)
 *   • We need to convert it to 'Avengers' type to access specific fields
 *   • Casting: (Avengers) obj forces Object to Avengers type
 *
 * ═════════════════════════════════════════════════════════════════════════════
 * STEP 2: Comparing Fields
 * ────────────────────────
 *   return this.id == avengers.id && 
 *          this.name.equals(avengers.name) && 
 *          this.power.equals(avengers.power);
 *
 *   Breaking it down:
 *   ├─ this.id == avengers.id
 *   │  └─ For int (primitive): Use == operator
 *   │     Returns true if both id values are identical
 *   │
 *   ├─ this.name.equals(avengers.name)
 *   │  └─ For String (object): Use .equals() method
 *   │     String comparison with memory reference and content
 *   │
 *   └─ this.power.equals(avengers.power)
 *      └─ For String (object): Use .equals() method
 *         Compares the actual string content, not reference
 *
 * ═════════════════════════════════════════════════════════════════════════════
 * STEP 3: Logical AND (&&) Operator
 * ──────────────────────────────────
 *   All three conditions must be true for the result to be true.
 *
 *   ├─ If ALL match     ──> returns true (objects are equal)
 *   ├─ If ANY mismatch  ──> returns false (objects are not equal)
 *   └─ Short-circuit: If first condition is false, rest are not evaluated
 *
 * ═════════════════════════════════════════════════════════════════════════════
 * EXAMPLE EXECUTION:
 * ──────────────────
 *   Avengers avenger1 = new Avengers(101, "Thor", "Lightning");
 *   Avengers avenger2 = new Avengers(101, "Thor", "Lightning");
 *
 *   avenger1.equals(avenger2);
 *
 *   Step-by-step:
 *   1. Cast avenger2 to Avengers type ✓
 *   2. Compare ids:     101 == 101     ✓ true
 *   3. Compare names:   "Thor".equals("Thor")     ✓ true
 *   4. Compare powers:  "Lightning".equals("Lightning") ✓ true
 *   5. Combine with &&: true && true && true = true
 *
 *   Result: true (objects are equal based on their data)
 *
 * ═════════════════════════════════════════════════════════════════════════════
 *           PROBLEM WITH CURRENT EQUALS METHOD
 * ═════════════════════════════════════════════════════════════════════════════
 * Suppose, Avengers avenger1 = new Avengers(101,"Thor","Lightning");
 * String s = "Hello";
 * System.out.println(avenger1.equals(s));
 * Now inside equals(): Avengers avengers = (Avengers) obj;
 * becomes: Avengers avengers = (Avengers) "Hello"; -->Impossible.
 * Because String is NOT Avengers.
 * So Java throws: ClassCastException
 *  Solution → instanceof
 * instanceof checks: “Is this object of this type?”
 * ═════════════════════════════════════════════════════════════════════════════
 */