package adapter;

public class Car implements Vehicule {
    @Override
    public void accelerer() {
        System.out.println("move car ...........");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.............");
    }
}
