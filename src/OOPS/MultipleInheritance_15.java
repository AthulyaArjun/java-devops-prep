/**
 * Multiple inheritance means one class inheriting features from multiple parents. Java doesn't support multiple
 * inheritance using classes.
 * class A {
     void show() {
         System.out.println("A");
      }
  }

 class B {
     void show() {
       System.out.println("B");
    }
 }

 class C extends A, B
 C c = new C(); --> compilation error
 c.show();

 * Which show() should run?
 * A's?
 * B's?
 * This creates ambiguity/confusion.
 * This problem is called: Diamond Problem, Because inheritance structure looks like diamond.

 *Solution : Interfaces. Because interfaces only define contacts. Hence, no ambiguity
 * interface Camera {
     void click();
  }

  interface MusicPlayer {
      void playMusic();
  }
 class Phone implements Camera, MusicPlayer {

      public void click() {
          System.out.println("Photo clicked");
      }
     public void playMusic() {
        System.out.println("Music playing");
   }
 }

 Rule:
 1. A class can: extend only ONE class, implement MULTIPLE interfaces
 class Child extends Parent implements A, B, C
 2. class --> extends. interface --> implements
 3. Multiple interface separated by comma
 4. If class implements multiple interfaces, it must implement all methods

 * Note: From Java 8 onward: interfaces can contain default methods with body.Then ambiguity CAN happen again.
 Java solves it using: method overriding

 */

package OOPS;

interface Printable{
    void print();
}

interface Showable{
    void show();
}

class Document implements Printable,Showable{

    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void show() {
        System.out.println("Show document");
    }
}

public class MultipleInheritance_15 {
    public static void main(String[] args) {
        Printable printable = new Document();
        printable.print();

        Showable showable = new Document();
        showable.show();
    }
}
