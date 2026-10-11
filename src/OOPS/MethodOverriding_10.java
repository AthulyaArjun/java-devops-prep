package OOPS;

public class MethodOverriding_10 {
    public static void main(String[] args) {

        UPIPayment upi = new UPIPayment();
        CardPayment card = new CardPayment();
        Payment payment = new Payment();

        upi.makePayment();
        card.makePayment();
        payment.makePayment();
    }
}

class Payment{

    void makePayment(){
        System.out.println("Generic Payment");
    }
}

class UPIPayment extends Payment{

    @Override
    void makePayment(){
        System.out.println("Making payment using UPI");
    }
}

class CardPayment extends Payment{

    @Override
    void makePayment(){
        System.out.println("Making payment using Card");
    }
}

