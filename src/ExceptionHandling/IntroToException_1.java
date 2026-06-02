package ExceptionHandling;
public class IntroToException_1 {
    public static void main(String[] args) {
        System.out.println("Exception Handling notes:");
        String message = """
                1. What is an exception in Java?
                An exception is an unexpected event or error that occurs during the execution of a program
                and disrupts the normal flow of execution.
                Exception handling is the process of handling such unexpected situations.
               
                2. Why do we need exception handling?
                Without exception handling, a single runtime error can crash your entire program.
                Exception handling provides a way to:
                detect errors
                handle them gracefully
                prevent program crashes
                continue program execution safely
               
                3. Exception Hierarchy
                Java treats errors and exceptions as objects. All of them inherit from a top class called
                java.lang.Throwable
                            Object
                              │
                         Throwable
                         ┌────────────┐
                       Error        Exception
                                     │
                         ┌────────────┴────────────┐
                     CheckedException     RuntimeException
                                                 │
                                         (Unchecked Exceptions)
               
                Throwable( top-level superclass): Everything that can be caught or thrown is a subclass of
                throwable
                2 main subclass: Exception and Error
               
                * Error(Not for handling):
                Represents serious problems that applications should not try to handle
                These are issues related to JVM or system environment. eg: OutOfMemoryError, StackOverflowError,
                VirtualMachineError
                These are fatal problems
               
                * Exception(This is what we handle):
                This class represents conditions that a program might want to catch and recover from
                2 types: Checked and Unchecked
               
                a. Checked Exception(Compile-Time exception):
                These are known at compile time and java forces you to handle them using try-catch or throws
                eg., IOException - file not found
                SQLException - bad database query
                ParseException - exception while parsing data
                ClassNotFoundException - when trying to load a class that doesn't exists
               
                b. Unchecked Exception(Runtime Exception):
                These occur at runtime and are not checked at compile time. Handling is optional but is
                recommended.
                All of them are subclasses of RuntimeException
               
                ArithmeticException - divide by zero
                NullPointerException - accessing a null object
                ArrayIndexOutOfBoundsException - index outside array bounds
                NumberFormatException - converting non-numeric string to number
               
                4. Syntax:
                try{
                //risky code
                }
                catch(ExceptionType e){
                //code to handle exception
                }
                What is e?
                e --> exception object. It contains information about error.
               
               5. Common Exceptions
                | Exception                      | Cause                     |
                | ------------------------------ | ------------------------- |
                | ArithmeticException            | Divide by zero            |
                | NullPointerException           | Using null object         |
                | ArrayIndexOutOfBoundsException | Invalid array index       |
                | NumberFormatException          | Invalid string conversion |
                | ClassCastException             | Wrong type casting        |
               
               """;
        System.out.println(message);
    }
}

/*
🎯 Interview Tip:
Q: What is the difference between Checked and Unchecked Exceptions?
A:Checked Exceptions are checked at compile time, must be handled (like IOException).
Unchecked Exceptions are not checked at compile time, and occur due to programming errors
(like NullPointerException).
 */