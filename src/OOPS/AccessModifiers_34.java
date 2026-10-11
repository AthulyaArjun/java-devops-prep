package OOPS;

public class AccessModifiers_34 {
    public static void main(String[] args) {
        System.out.println("Access modifiers: ");
        String message = """
                There are 4 access modifiers which defines the scope or visibility of classes,
                variables,methods and constructors.They control who can access what in your program.
                It is vital for data security and encapsulation.
                
                1. private
                    Access is restricted to the class
                    most secure
                    commonly used for class variables and helper methods
                    class BankAccount {
                        private double balance = 1000;
                
                        private void showBalance() {
                            System.out.println("Balance: " + balance);
                        }
                
                        public void accessBalance() {
                            showBalance();  // ✅ Allowed (same class)
                        }
                    }
                
                cannot access balance and showBalance() outside the class BankAccount.
                
                2. default
                    If no modifier is specified, its accessible only within the same package
                    Not accessible from classes in other packages even if its imported
                    class Student {
                        int age = 20; // default access
                        void showAge() {
                            System.out.println("Age: " + age);
                        }
                    }
                ✅ Accessible from other classes in the same folder/package
                ❌ Not from other packages
                
                
                3. protected
                    Accessible within the same package
                    Also accessible in subclasses even if they are in different package
                    class Animal {
                        protected void makeSound() {
                            System.out.println("Animal sound");
                        }
                    }
                
                    class Dog extends Animal {
                        void bark() {
                            makeSound(); // ✅ Allowed
                        }
                    }
                Best when you're working with inheritance and want child classes to access parent members.
                
                
                4. public
                    No restrictions- accessible from anywhere
                    used for main(), utility methods, API methods
                    public class Main {
                        public static void main(String[] args) {
                            System.out.println("This is public");
                        }
                    }
                Accessible across packages, projects, and modules.
                
                | Use Case                            | Recommended Access Modifier |
                |-------------------------------------|-----------------------------|
                | Class variables (encapsulation)     | `private` + public setters/getters |
                | Utility classes / methods           | `public` |
                | Helper methods not meant for others | `private` |
                | Methods used only within package    | default |
                | Allow subclass overrides            | `protected` |
                """;
        System.out.println(message);
    }
}


/*
| Modifier     | Accessible Within Same Class | Same Package | Subclass (outside package) | Other Classes |
|--------------|------------------------------|--------------|----------------------------|----------------|
| `private`    | ✅ Yes                        | ❌ No        | ❌ No                      | ❌ No           |
| (default)*   | ✅ Yes                        | ✅ Yes       | ❌ No                      | ❌ No           |
| `protected`  | ✅ Yes                        | ✅ Yes       | ✅ Yes                     | ❌ No           |
| `public`     | ✅ Yes                        | ✅ Yes       | ✅ Yes                     | ✅ Yes          |
 */