/**
 *Method Overriding occurs when a subclass provides a specific implementation of a method that is already
 defined in its superclass.
 * 🔁 Rules of Overriding:
 * Method signature (name + parameters) must be the same.
 * The return type must be the same or covariant (subtype).
 * The access modifier in the child must be equal or more visible.
 * @Override annotation is optional but highly recommended (helps catch errors).
 * Only non-final, non-static methods can be overridden.
 *
 * Q: Can constructors be overridden?
 * ➤ No, constructors are not inherited, hence they can’t be overridden.
 * 🔹 Q: What if you remove @Override?
 * ➤ The method still overrides, but if there's a typo, Java won’t catch it at compile time.
 * @Override helps detect such issues.
 */

package OOPS;

public class MethodOverriding_9 {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.draw();
    }
}

class Shape{
    void draw(){
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Drawing Circle");
    }
}