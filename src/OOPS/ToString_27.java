/**
 * ═════════════════════════════════════════════════════════════════════════════
 *                          toString() METHOD
 * ═════════════════════════════════════════════════════════════════════════════
 * ► DEFINITION:
 *   toString() is a method inherited from the Object class that returns a
 *   String representation of an object.
 * ═════════════════════════════════════════════════════════════════════════════
 * ► DEFAULT BEHAVIOR:
 *   Format: ClassName@HexadecimalHashcode
 *   Example:
 *       Student@36baf30c
 *       ├─ Student      ──> Class name
 *       └─ 36baf30c     ──> Hexadecimal hash code
 *   Problem: This is NOT human-readable and not meaningful!
 * ═════════════════════════════════════════════════════════════════════════════
 * ► WHY OVERRIDE toString()?
 *   To display meaningful object information in a human-readable format.
 *   Instead of seeing memory reference, show actual object data.
 * ═════════════════════════════════════════════════════════════════════════════
 * ► SYNTAX - HOW TO OVERRIDE:
 *
 *   @Override
 *   public String toString() {
 *       return "custom message";
 *   }
 *   ⓘ IMPORTANT RULE: Return type must always be String
 * ═════════════════════════════════════════════════════════════════════════════
 * ► AUTOMATIC INVOCATION:
 *   When you write:
 *       System.out.println(obj);

 *   Java internally converts it to:
 *       System.out.println(obj.toString());

 *   This means toString() is automatically called!
 * ═════════════════════════════════════════════════════════════════════════════
 * ► BEST PRACTICES:
 *   • Include all important fields of the object
 *   • Use clear, descriptive labels
 *   • Use escape sequences like \n for readability
 *   • Keep output concise but informative
 * ═════════════════════════════════════════════════════════════════════════════
 */

package OOPS;

class Teacher{
    int id;
    String name;

    Teacher(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Teacher id: "+id+ "\nName: " +name;
    }
}
public class ToString_27 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(101,"Anjana");
        System.out.println(teacher);
    }
}
