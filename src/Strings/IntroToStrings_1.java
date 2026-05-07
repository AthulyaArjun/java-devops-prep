package Strings;

public class IntroToStrings_1 {
    public static void main(String[] args) {

        /**
         * ================================
         * INTRODUCTION TO STRINGS IN JAVA
         * ================================
         *
         * A String is a sequence of characters.
         *
         * Example:
         * "hello" contains:
         * h e l l o
         *
         * Internally, String behaves like a character array.
         *
         * Example:
         * char[] ch = {'h','e','l','l','o'};
         *
         * Strings are extremely important in Java because almost everything uses Strings:
         * - usernames
         * - passwords
         * - APIs
         * - URLs
         * - file names
         * - database queries
         * - logs
         * etc.
         */


        /**
         * ================================
         * WAYS TO CREATE A STRING
         * ================================
         */

        // 1. Using String Literal (Most Common)
        String a = "hello";

        // 2. Using new Keyword
        // Creates object explicitly
        String b = new String("hello");


        /**
         * ================================
         * STRING MEMORY & STRING CONSTANT POOL (SCP)
         * ================================
         *
         * Java has a special memory area called:
         *
         * String Constant Pool (SCP)
         *
         * Purpose:
         * Avoid duplicate String objects and save memory.
         *
         * Example:
         *
         * String a = "hello";
         *
         * Java checks:
         * "Does 'hello' already exist inside String Pool?"
         *
         * If NO:
         * -> Object is created.
         *
         * If YES:
         * -> Existing object reference is reused.
         *
         * Important:
         * Using keyword "new" ALWAYS creates a new object,
         * even if same content already exists.
         */


        /**
         * ================================
         * COMPARING STRINGS
         * ================================
         *
         * == operator checks:
         * -> Whether both variables refer to the SAME object.
         *
         * equals() method checks:
         * -> Whether actual String content is same.
         */


        /**
         * Example 1:
         */

        String str1 = "hello";
        String str2 = "hello";

        // true because both refer to same pooled object
        System.out.println(str1 == str2);


        /**
         * Example 2:
         */

        String str3 = new String("hello");
        String str4 = new String("hello");

        // false because both are different objects
        System.out.println(str3 == str4);

        // true because content is same
        System.out.println(str3.equals(str4));


        /**
         * ================================
         * DIFFERENCE BETWEEN == AND equals()
         * ================================
         *
         * ==          -> checks object reference
         * equals()    -> checks actual content
         */


        /**
         * ================================
         * STRING IMMUTABILITY
         * ================================
         *
         * Strings are immutable in Java.
         *
         * Immutable means:
         * -> Object cannot be changed after creation.
         *
         * Once a String object is created,
         * its content cannot be modified.
         *
         * Any modification creates a NEW object.
         */


        /**
         * Example:
         */

        String s = "hello";

        s.concat("world");

        /**
         * Original String is NOT modified.
         *
         * Java creates a new object:
         *
         * "helloworld"
         *
         * But since it is not stored anywhere,
         * that object gets lost.
         *
         * Original still remains:
         *
         * s -> "hello"
         */


        /**
         * Correct Way:
         */

        s = s.concat("world");

        /**
         * Now:
         *
         * s -> "helloworld"
         */


        /**
         * ================================
         * WHY ARE STRINGS IMMUTABLE?
         * ================================
         */


        /**
         * 1. SECURITY
         * ----------------
         *
         * Strings are used in:
         * - passwords
         * - database URLs
         * - API keys
         * - network connections
         *
         * If Strings were mutable,
         * hackers/code could modify them unexpectedly.
         *
         * Immutable Strings are safer.
         */


        /**
         * 2. STRING POOL OPTIMIZATION
         * ----------------------------
         *
         * Example:
         *
         * String a = "hello";
         * String b = "hello";
         *
         * Both share same object from String Pool.
         *
         * If Strings were mutable:
         *
         * Suppose:
         * a changes to "bye"
         *
         * Then:
         * b would also change unexpectedly.
         *
         * Huge problem.
         *
         * Immutability makes String Pool safe.
         */


        /**
         * 3. THREAD SAFETY
         * -----------------
         *
         * Multiple threads can safely use same String object because:
         * -> nobody can modify it.
         *
         * Very important in large applications.
         */


        /**
         * 4. HASHMAP PERFORMANCE
         * -----------------------
         *
         * Strings are heavily used as keys in HashMap.
         *
         * If String changes after insertion:
         * -> retrieval breaks
         *
         * Immutable Strings keep hash values stable.
         */


        /**
         * ================================
         * IMPORTANT INTERVIEW QUESTION
         * ================================
         *
         * Why is String immutable in Java?
         *
         * Answer:
         * String is immutable in Java for:
         * - security
         * - thread safety
         * - String Pool optimization
         * - reliable hashing behavior
         *
         * Once created, String objects cannot be modified.
         * Any modification creates a new object.
         */
    }
}