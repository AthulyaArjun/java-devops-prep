package OOPS;

public class IntroToOOPS_1 {
    public static void main(String[] args) {
        printHeader();
        printIntroduction();
        printPillars();
        printBasics();
        printFooter();
    }

    private static void printHeader() {
        System.out.println("\n" + "=".repeat(90));
        System.out.println("█".repeat(90));
        System.out.println(centerText("OBJECT-ORIENTED PROGRAMMING (OOPs) IN JAVA", 90));
        System.out.println("█".repeat(90));
        System.out.println("=".repeat(90) + "\n");
    }

    private static void printIntroduction() {
        System.out.println("📌 OVERVIEW:");
        System.out.println("-".repeat(90));
        String message = """
                Object-Oriented programming is a methodology that organizes software design around data,
                or objects, rather than functions and logic. In Java, everything revolves around objects and classes.
                This approach facilitates better organization of code and mirrors real-world systems more effectively.
                """;
        System.out.println(message);
    }

    private static void printPillars() {
        System.out.println("\n" + "=".repeat(90));
        System.out.println("🔷 THE 4 PILLARS OF OOPs:");
        System.out.println("=".repeat(90) + "\n");

        // Pillar 1: Encapsulation
        System.out.println("┌─ 1️⃣ ENCAPSULATION");
        System.out.println("├─ Description:");
        System.out.println("│  • Bundling data (variables) and methods operating on that data within a single unit (class)");
        System.out.println("│  • Restricts direct access to object components");
        System.out.println("│  • Prevents unintended interference and misuse of data\n");
        System.out.println("├─ Example:");
         System.out.println("""
                 │  public class Student {
                 │      private String name;        // Private variable
                 │
                 │      public String getName() {
                 │          return name;
                 │      }
                 │
                 │      public void setName(String newName) {
                 │          name = newName;
                 │      }
                 │  }
                 ├─ Benefit: The name variable is private and accessed only through public getter/setter methods
                 └──────────────────────────────────────────────────────────────────────────────────────────
                 """);

        // Pillar 2: Abstraction
        System.out.println("\n┌─ 2️⃣ ABSTRACTION");
        System.out.println("├─ Description:");
        System.out.println("│  • Hiding complex implementation details");
        System.out.println("│  • Showing only essential features of an object");
        System.out.println("│  • Achieved using interfaces and abstract classes\n");
        System.out.println("├─ Example:");
         System.out.println("""
                 │  abstract class Animal {
                 │      abstract void makeSound();
                 │  }
                 │
                 │  class Dog extends Animal {
                 │      void makeSound() {
                 │          System.out.println("Bark");
                 │      }
                 │  }
                 ├─ Benefit: Animal is abstract; Dog provides specific implementation for makeSound()
                 └──────────────────────────────────────────────────────────────────────────────────────────
                 """);

        // Pillar 3: Inheritance
        System.out.println("\n┌─ 3️⃣ INHERITANCE");
        System.out.println("├─ Description:");
        System.out.println("│  • Subclass acquires properties and behaviors of a superclass");
        System.out.println("│  • Promotes code reusability");
        System.out.println("│  • Establishes parent-child relationship\n");
        System.out.println("├─ Example:");
         System.out.println("""
                 │  class Vehicle {
                 │      void start() {
                 │          System.out.println("Vehicle started");
                 │      }
                 │  }
                 │
                 │  class Car extends Vehicle {
                 │      void start() {
                 │          System.out.println("Car started");
                 │      }
                 │  }
                 ├─ Benefit: Car inherits from Vehicle and overrides the start() method
                 └──────────────────────────────────────────────────────────────────────────────────────────
                 """);

        // Pillar 4: Polymorphism
        System.out.println("\n┌─ 4️⃣ POLYMORPHISM (Many Forms)");
        System.out.println("├─ Description:");
        System.out.println("│  • Objects treated as instances of their parent class");
        System.out.println("│  • Two main types:\n");

        System.out.println("├─ Type A: COMPILE-TIME POLYMORPHISM (Method Overloading)");
        System.out.println("│  • Multiple methods with same name but different parameters");
        System.out.println("""
                │  Example:
                │      class MathOperations {
                │          int add(int a, int b) {
                │              return a + b;
                │          }
                │          double add(double a, double b) {
                │              return a + b;
                │          }
                │      }
                """);

        System.out.println("├─ Type B: RUNTIME POLYMORPHISM (Method Overriding)");
        System.out.println("│  • Subclass provides specific implementation of superclass method");
         System.out.println("""
                 │  Example:
                 │      class Animal {
                 │          void makeSound() {
                 │              System.out.println("Animal makes sound");
                 │          }
                 │      }
                 │
                 │      class Cat extends Animal {
                 │          void makeSound() {
                 │              System.out.println("Meow");
                 │          }
                 │      }
                 └──────────────────────────────────────────────────────────────────────────────────────────
                 """);
    }

    private static void printBasics() {
        System.out.println("\n" + "=".repeat(90));
        System.out.println("🔸 BASIC OOPs CONCEPTS:");
        System.out.println("=".repeat(90) + "\n");

        System.out.println("▶ 1. CLASS");
        System.out.println("   └─ Blueprint for creating objects\n");

        System.out.println("▶ 2. OBJECT");
        System.out.println("   └─ An instance of a class\n");

        System.out.println("▶ 3. CONSTRUCTOR");
        System.out.println("   ├─ Special methods invoked when an object is created");
        System.out.println("   ├─ Same name as the class with no return type");
        System.out.println("""
                   └─ Example:
                      public class Car {
                          String color;
                          public Car(String carColor) {
                              color = carColor;
                          }
                      }
                """);

        System.out.println("▶ 4. 'this' KEYWORD");
        System.out.println("   ├─ Refers to the current object instance");
        System.out.println("   ├─ Resolves naming conflicts between instance variables and parameters");
        System.out.println("""
                   └─ Example:
                      public class Car {
                          String color;
                          public Car(String color) {
                              this.color = color; // 'this.color' = instance variable
                          }
                      }
                """);
    }

    private static void printFooter() {
        System.out.println("=".repeat(90));
        System.out.println("█".repeat(90));
        System.out.println(centerText("End of OOPs Introduction", 90));
        System.out.println("█".repeat(90));
        System.out.println("=".repeat(90) + "\n");
    }

    private static String centerText(String text, int width) {
        int padding = (width - text.length()) / 2;
        return " ".repeat(Math.max(0, padding)) + text;
    }
}
