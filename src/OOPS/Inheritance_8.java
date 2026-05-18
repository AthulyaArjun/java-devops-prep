package OOPS;

public class Inheritance_8 {
    public static void main(String[] args) {

        Dog dog = new Dog("Rio",3, "Beagle");
        dog.displayAnimal();
        dog.displayDog();
    }
}

class Animal{
    String name;
    int age;

    Animal(String  name, int age){
        this.name = name;
        this.age = age;
    }

    void displayAnimal(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class Dog extends Animal{
    String breed;

    Dog(String name, int age, String breed){
        super(name,age);

        this.breed = breed;
    }

    void displayDog(){
        System.out.println("Breed: "+breed);
    }
}

/**
 * super()
 * Used to initialize parent part of object.

 * this
 * Used to initialize child/current object variables.

 * Tiny Interview Point
 * Every child object contains:
 * parent portion
 * child portion

 * So object memory is actually:

 * Dog Object
 *  ├── Animal Part
 *  │     ├── name
 *  │     └── age
 *  │
 *  └── Dog Part
 *        └── breed
 */