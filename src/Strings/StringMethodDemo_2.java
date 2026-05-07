package Strings;

public class StringMethodDemo_2 {
    public static void main(String[] args) {
        /**
         * ================================String Methods===============================
         * String methods are built-in functions that allow us to perform various operations on strings.
         * Some common String methods include:
         * - length(): Returns the length of the string.
         * - charAt(int index): Returns the character at the specified index., Indexing starts at 0
         * - substring(int beginIndex, int endIndex): Returns a new string that is a substring of this string. includes start index but not end index
         * - toUpperCase(): Converts all characters in the string to uppercase.
         * - toLowerCase(): Converts all characters in the string to lowercase.
         * - equals(Object obj): Compares this string to the specified object.
         * - contains(CharSequence s1): Returns true if substring exists.
         * - indexOf(String str): Returns the index of the first occurrence of the specified substring, or -1 if there is no such occurrence.
         * - trim(): Returns a copy of the string with leading and trailing whitespace removed. It does not remove spaces in the middle
         * - equalsIgnoreCase(String anotherString): Compares this String to another String, ignoring case considerations.
         * - startsWith(String prefix): Tests if this string starts with the specified prefix.
         * - endsWith(String suffix): Tests if this string ends with the specified suffix.
         * - replace(char oldChar, char newChar): Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
         * - split(String regex): Splits this string around matches of the given regular expression.
         * - isEmpty(): Returns true if, and only if, length() is 0.
        */

        String s1 = "Hello, World!";
        System.out.println("s1.length() = " + s1.length()); // 13
        System.out.println("Character at index 2 = " + s1.charAt(2)); // l
        System.out.println("To upper case = " + s1.toUpperCase()); // HELLO, WORLD!
        System.out.println("To lower case = " + s1.toLowerCase()); // hello, world!

        String s2 =  " Hello   ";
        System.out.println("Removing extra spaces = " + s2.trim()); // Hello
        System.out.println("Are both strings equal = " + s1.equals(s2)); // false

        String a = "HELLO";
        String b = "hello";
        System.out.println("Are both strings equal ignore case = " + a.equalsIgnoreCase(b)); // true

        System.out.println("Does String contains World? = " + s1.contains("World")); // true
        System.out.println("Is string staring with Hello? = " + s1.startsWith("Hello")); // true
        System.out.println("Is string ending with World? = " + s1.endsWith("World!")); // true
        System.out.println("Part of string = " + s1.substring(3,8)); // lo, W

        System.out.println("Index of World = " + s1.indexOf("World")); // 7
        System.out.println("Replace l with x = " + s1.replace('l','x')); // Hexxo, Worxd!

        String s3 = "Java Python DevOps";
        String[] words = s3.split(" ");

        System.out.println(words[0]); // Java
        System.out.println(words[1]); // Python
        System.out.println(words[2]); // DevOps

        String empty = "";
        System.out.println(empty.isEmpty()); // true

    }
}
