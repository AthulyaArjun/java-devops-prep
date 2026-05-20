package OOPS;

class Calculator{

    void add (int x, int y){
        int sum = x+y;
        System.out.println("Sum: "+sum);
        this.multiply(x,y);
    }

    void multiply(int x, int y){
        int product = x*y;
        System.out.println("Product: "+product);
    }
}

public class ThisDemo_20 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10,30);
    }
}

/**
 * | Statement        | Meaning                        | Must be First? |
 * | ---------------- | ------------------------------ | -------------- |
 * | `this.method()`  | current object method call     | ❌ No           |
 * | `this()`         | call current class constructor | ✅ Yes          |
 * | `super.method()` | parent method call             | ❌ No           |
 * | `super()`        | call parent constructor        | ✅ Yes          |
 */