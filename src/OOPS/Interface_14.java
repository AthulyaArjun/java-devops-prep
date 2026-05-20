package OOPS;

interface PaymentMethod{
    void pay();

    void refund();
}

class UPI implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Payment using UPI");
    }

    @Override
    public void refund() {
        System.out.println("Refund using UPI");
    }
}

class CreditCard implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Payment using credit card");
    }

    @Override
    public void refund() {
        System.out.println("Refund using credit card");
    }
}

class NetBanking implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Payment using net banking");
    }

    @Override
    public void refund() {
        System.out.println("Refund using net banking");
    }
}


public class Interface_14 {
    public static void main(String[] args) {
        PaymentMethod paymentMethod = new UPI();
        paymentMethod.pay();
        paymentMethod.refund();

        paymentMethod = new CreditCard();
        paymentMethod.pay();
        paymentMethod.refund();

        paymentMethod = new NetBanking();
        paymentMethod.pay();
        paymentMethod.refund();
    }
}
