package BasicsJava;

/**
 * A variable is a container, or we can say it is a named memory location used to store a value.
 * Variables define how data is stored, accessed, and manipulated.
 * A variable in Java has three components,
 * •	Data Type: Defines the kind of data stored (e.g., int, String, float).
 * •	Variable Name: A unique identifier following Java naming rules.
 * •	Value: The actual data assigned to the variable.
 *
 * syntax: dataType variableName = value;
 */
public class VariablesDemo_2 {
    public static void main(String[] args) {
        String name = "Athulya";
        int age = 29;
        double cgpa = 8.09;
        boolean placed = false;

        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);
        System.out.println(placed);
    }
}

/** Naming convention of variables:
 * cannot start with number
 * no special symbols like -
 * cannot use reserved keywords
 * should follow camelCase format
 */


/** 3 types of variable:
 * Local variables are declared inside a method/block and belongs to that method only.
 * It’s destroyed once the method ends; they do not get default values and must be initialized before use.
 *
 *
 * Instance variables (fields) are declared inside a class but outside methods; they belong to each object;
 * each object gets its own copy and exists as long as the object exists and get default values automatically.
 * objname.var
 *
 *
 * Static variables are declared inside the class but outside the method but with the keyword static.
 * It belongs to the class and is shared by all objects in the class. Exists for the lifetime of the class.
 * classname.var
 */