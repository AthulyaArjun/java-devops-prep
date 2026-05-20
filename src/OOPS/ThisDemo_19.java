package OOPS;

class MobilePhone{
    String brand;
    double price;

    MobilePhone(String brand, double price){
        this.brand = brand;
        this.price = price;
    }

    void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
        System.out.println();
    }
}

public class ThisDemo_19 {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Iphone", 150000.00);
        phone.display();
    }
}
