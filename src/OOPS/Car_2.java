package OOPS;

public class Car_2 {
    String brand;
    int model;
    String  price;

    public Car_2(String brand, int model, String  price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }
    public static void main(String[] args) {

        Car_2 car1 = new Car_2("Kia",2021, "19.5 Lakh");
        car1.display();

        System.out.println();

        Car_2 car2 = new Car_2("MG", 2023, "23.0 Lakh");
        car2.display();
    }
}
