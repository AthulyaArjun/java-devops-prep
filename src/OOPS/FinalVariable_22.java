/**
 * Final variable is a variable who value cannot be changed after initialization. It cannot be reassigned
 * Useful when some values like dob, aadhar number etc. shouldn't be changed.
 * Usually final constants written in:
 * UPPER_CASE
 * Example: final double PI_VALUE = 3.14;

 */
package OOPS;

public class FinalVariable_22 {
    final double GST = 18.0;

    void display(){
        //GST = 20.0; --> Compilation error
        System.out.println("GST is: "+GST);
    }

    public static void main(String[] args) {
        FinalVariable_22 object = new FinalVariable_22();

        object.display();
    }
}
