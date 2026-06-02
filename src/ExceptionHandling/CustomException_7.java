/**
 * A Custom Exception is a user-defined exception class created by extending Exception or RuntimeException
 * to represent application-specific error conditions.
 * Custom exception is needed to represent business-specific errors more clearly and improve readability
 * and maintainability of the application.
 *
 * Step 1: Create our own Exception class
 * public class InvalidAgeException extends Exception {
 *
 * }
 * Step 2: Add constructor
 * public class InvalidAgeException extends Exception {
 *
 *     public InvalidAgeException(String message){
 *         super(message);
 *     }
 * }
 * Step 3: throw it
 * public static void checkAge(int age)
 *         throws InvalidAgeException {
 *
 *     if(age < 18){
 *         throw new InvalidAgeException(
 *                 "Age must be at least 18");
 *     }
 *
 *     System.out.println("Eligible to vote");
 * }
 * Step 4: catch it
 * try{
 *     checkAge(age);
 * }
 * catch(InvalidAgeException e){
 *     System.out.println(e.getMessage());
 * }
 */

package ExceptionHandling;

public class CustomException_7 {

    public static void checkEntry(int time) throws OfficeEntryException{
        if (time > 10){
            throw new OfficeEntryException("Cant enter after 10");
        }
        else {
            System.out.println("You may enter");
        }
    }
    public static void main(String[] args) {

        try {
            checkEntry(11);
        } catch (OfficeEntryException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Custom exception");
        }
    }
}
