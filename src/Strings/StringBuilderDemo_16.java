/**
StringBuilder is a class used to create mutable strings.
It avoids creating many intermediate objects during concatenation. Unlike String, it allows you to modify the content
without creating a new object.
- Faster and more memory efficient than String
- But is NOT thread safe (for thread safety, use StringBuffer)

syntax:
StringBuilder sb = new StringBuilder("Hello");
 */

package Strings;

public class StringBuilderDemo_16 {
    public static void main(String[] args) {
        System.out.println("========== StringBuilder Demo ==========\n");

        // 1. CONSTRUCTOR - Different ways to create StringBuilder
        System.out.println("1. CONSTRUCTORS");
        StringBuilder sb1 = new StringBuilder();                    // Empty
        StringBuilder sb2 = new StringBuilder("Hello");            // With String
        StringBuilder sb3 = new StringBuilder(50);                 // With capacity
        System.out.println("   sb1 (empty): \"" + sb1 + "\"");
        System.out.println("   sb2 (with String): \"" + sb2 + "\"");
        System.out.println("   sb3 (capacity 50): \"" + sb3 + "\"");
        System.out.println();

        // 2. APPEND() - Adds characters at the end
        System.out.println("2. APPEND() - Add to end");
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append(" ");
        sb.append("is");
        sb.append(" ");
        sb.append("fun");
        System.out.println("   Result: \"" + sb + "\"");
        System.out.println();

        // 3. INSERT() - Inserts characters at specified position
        System.out.println("3. INSERT() - Insert at specific position");
        sb.insert(5, "very ");  // Insert "very " at index 5
        System.out.println("   After insert(5, \"very \"): \"" + sb + "\"");
        System.out.println();

        // 4. DELETE() - Deletes characters from start index to end index (exclusive)
        System.out.println("4. DELETE() - Delete range [start, end)");
        StringBuilder sb4 = new StringBuilder("HelloWorld");
        sb4.delete(5, 10);  // Delete from index 5 to 9 (World)
        System.out.println("   Original: \"HelloWorld\"");
        System.out.println("   After delete(5, 10): \"" + sb4 + "\"");
        System.out.println();

        // 5. DELETECHARAT() - Deletes character at specific index
        System.out.println("5. DELETECHARAT() - Delete at specific index");
        StringBuilder sb5 = new StringBuilder("HelloWorld");
        sb5.deleteCharAt(4);  // Delete 'o' at index 4
        System.out.println("   Original: \"HelloWorld\"");
        System.out.println("   After deleteCharAt(4): \"" + sb5 + "\"");
        System.out.println();

        // 6. REPLACE() - Replaces characters from start to end with new string
        System.out.println("6. REPLACE() - Replace range [start, end) with string");
        StringBuilder sb6 = new StringBuilder("HelloWorld");
        sb6.replace(5, 10, "Java");  // Replace "World" with "Java"
        System.out.println("   Original: \"HelloWorld\"");
        System.out.println("   After replace(5, 10, \"Java\"): \"" + sb6 + "\"");
        System.out.println();

        // 7. REVERSE() - Reverses the entire string
        System.out.println("7. REVERSE() - Reverse entire string");
        StringBuilder sb7 = new StringBuilder("Hello");
        System.out.println("   Original: \"" + sb7 + "\"");
        sb7.reverse();
        System.out.println("   After reverse(): \"" + sb7 + "\"");
        System.out.println();

        // 8. LENGTH() - Returns the length of the string
        System.out.println("8. LENGTH() - Get string length");
        StringBuilder sb8 = new StringBuilder("Hello");
        System.out.println("   String: \"" + sb8 + "\"");
        System.out.println("   Length: " + sb8.length());
        System.out.println();

        // 9. CAPACITY() - Returns the capacity (allocated memory)
        System.out.println("9. CAPACITY() - Get allocated memory capacity");
        StringBuilder sb9 = new StringBuilder("Hello");
        System.out.println("   String: \"" + sb9 + "\"");
        System.out.println("   Length: " + sb9.length());
        System.out.println("   Capacity: " + sb9.capacity());
        System.out.println();

        // 10. ENSUREAPACITY() - Ensures minimum capacity
        System.out.println("10. ENSURECAPACITY() - Ensure minimum capacity");
        StringBuilder sb10 = new StringBuilder("Hi");
        System.out.println("   Initial capacity: " + sb10.capacity());
        sb10.ensureCapacity(100);  // Ensure at least 100 capacity
        System.out.println("   After ensureCapacity(100): " + sb10.capacity());
        System.out.println();

        // 11. CHARAT() - Returns character at specific index
        System.out.println("11. CHARAT() - Get character at specific index");
        StringBuilder sb11 = new StringBuilder("Hello");
        System.out.println("   String: \"" + sb11 + "\"");
        System.out.println("   CharAt(0): '" + sb11.charAt(0) + "'");
        System.out.println("   CharAt(4): '" + sb11.charAt(4) + "'");
        System.out.println();

        // 12. SETCHARAT() - Sets character at specific index
        System.out.println("12. SETCHARAT() - Set character at specific index");
        StringBuilder sb12 = new StringBuilder("Hello");
        System.out.println("   Original: \"" + sb12 + "\"");
        sb12.setCharAt(0, 'J');  // Change 'H' to 'J'
        System.out.println("   After setCharAt(0, 'J'): \"" + sb12 + "\"");
        System.out.println();

        // 13. SUBSTRING() - Returns substring from start index to end index (exclusive)
        System.out.println("13. SUBSTRING() - Get substring [start, end)");
        StringBuilder sb13 = new StringBuilder("HelloWorld");
        System.out.println("   String: \"" + sb13 + "\"");
        System.out.println("   substring(0, 5): \"" + sb13.substring(0, 5) + "\"");
        System.out.println("   substring(5): \"" + sb13.substring(5) + "\"");
        System.out.println();

        // 14. SETLENGTH() - Sets the length of the string
        System.out.println("14. SETLENGTH() - Set new length");
        StringBuilder sb14 = new StringBuilder("HelloWorld");
        System.out.println("   Original: \"" + sb14 + "\" (length: " + sb14.length() + ")");
        sb14.setLength(5);  // Truncate to 5 characters
        System.out.println("   After setLength(5): \"" + sb14 + "\" (length: " + sb14.length() + ")");
        System.out.println();

        // 15. TOSTRING() - Converts StringBuilder to String
        System.out.println("15. TOSTRING() - Convert to String");
        StringBuilder sb15 = new StringBuilder("Java");
        String str = sb15.toString();
        System.out.println("   StringBuilder: sb15");
        System.out.println("   Converted String: \"" + str + "\"");
        System.out.println("   Type: " + str.getClass().getSimpleName());
        System.out.println();

        // 16. APPEND() WITH DIFFERENT DATA TYPES
        System.out.println("16. APPEND() WITH OTHER DATA TYPES");
        StringBuilder sb16 = new StringBuilder();
        sb16.append(42);              // int
        sb16.append(3.14);            // double
        sb16.append(true);            // boolean
        sb16.append('A');             // char
        System.out.println("   Appended: int(42), double(3.14), boolean(true), char('A')");
        System.out.println("   Result: \"" + sb16 + "\"");
        System.out.println();

        // 17. PRACTICAL EXAMPLE - Building a string efficiently
        System.out.println("17. PRACTICAL EXAMPLE - Efficient string building");
        StringBuilder sb17 = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            sb17.append(i).append(", ");
        }
        sb17.delete(sb17.length() - 2, sb17.length());  // Remove last ", "
        System.out.println("   Numbers: " + sb17);
        System.out.println();

        System.out.println("========== End of Demo ==========");
    }
}
