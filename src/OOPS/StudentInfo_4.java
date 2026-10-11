package OOPS;

public class StudentInfo_4 {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("mac", 24, 850000);
        laptop.displayLaptop();

        Student student = new Student();
        Student student1 = new Student("Athulya");

        MyBooks book1 = new MyBooks();
        MyBooks book2 = new MyBooks("Harry Potter");
        MyBooks book3 = new MyBooks("Wings of Fire", "Abdul Kalam");
        MyBooks book4 = new MyBooks("God of Small Things", "Arundhathi Roy", 500);


    }
}

class Laptop{
    String brand;
    int ram;
    double price;

    public Laptop(String brand, int ram, double price){
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    void displayLaptop(){
        System.out.println("Brand: "+brand);
        System.out.println("Ram: "+ram);
        System.out.println("Price: "+price);
        System.out.println();
    }
}

class Student{
    String name;

    Student(){
        System.out.println("Default constructor printing.....");
        System.out.println();
    }

    Student(String name){
        this.name = name;
        System.out.println("Parameterized constructor calling....");
        System.out.println("Name: "+name);
        System.out.println();
    }

}

class MyBooks {
    String title;
    String author;
    int price;

    MyBooks(){
        System.out.println("Default...");
        System.out.println();
    }
    MyBooks(String title){
        this.title = title;
        System.out.println("Title: "+title);
        System.out.println();
    }
    MyBooks(String title, String author){
        this.title = title;
        this.author = author;
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println();

    }
    MyBooks(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println();

    }
}
