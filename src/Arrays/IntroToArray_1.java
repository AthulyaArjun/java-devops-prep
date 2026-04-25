package Arrays;

public class IntroToArray_1 {
    public static void main(String[] args) {
        System.out.println("An array is a collection of similar type of data stored in contiguous memory location.");
        // instead of writing
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        // we use
        int[] arr = {10,20,30,40,50}; // This is much cleaner

        System.out.println("Why Arrays?\n" +
                "Handling many values individually becomes difficult" +
                " Especially in: \n" +
                "student marks, employee salaries etc. Arrays solve this");

        System.out.println("Important rule: 1. Arrays store same datatype only");

        int[] arr1 = {10,20,30}; //allowed
        //int[] arr2 = {10,"hello",30}; not allowed --> compile error

        System.out.println("2. Indexing always starts from 0");

        int[] arr3 = {10,20,30,40,50};
        /**
         * | Index | Value |
         * | ----- | ----: |
         * | 0     |    10 |
         * | 1     |    20 |
         * | 2     |    30 |
         * | 3     |    40 |
         * | 4     |    50 |
         */

        System.out.println("Accessing using arr3[2]"); // will print 30

        System.out.println("Declaration \n" +
                "int[] arr; --> only declaring");

        System.out.println("Initialization \n" +
                "arr = new int[5]; --> creating memory for 5 elements");

        System.out.println("Combing both together\n" +
                "int[] arr = new int[5];\n" +
                "OR\n"+
                "int[] arr = {10,20,30,40,50};");
    }
}
