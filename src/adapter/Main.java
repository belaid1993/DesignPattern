package adapter;

public class Main {

    public static void main(String[] args) {
        Vehicule car = new Car();
        Vehicule velo = new BicicletteAdapter(new Bicyclete());
        movecar(velo);
    }

    private static void movecar(Vehicule car) {
        car.accelerer();
        car.stop();
        System.out.println(".........................");
    }
}
