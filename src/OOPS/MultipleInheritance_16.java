package OOPS;

interface Engine{
    void startEngine();
    void stopEngine();
}

interface GPS{
    void showLocation();
    void navigate();
}

class Car implements Engine,GPS{

    @Override
    public void startEngine() {
        System.out.println("Starting Car Engine");
    }

    @Override
    public void showLocation() {
        System.out.println("Showing current location");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating....");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping Engine");
    }
}
public class MultipleInheritance_16 {
    public static void main(String[] args) {

        Engine engine = new Car();
        GPS gps = new Car();
        engine.startEngine();
        gps.showLocation();
        gps.navigate();
        engine.stopEngine();
    }
}
