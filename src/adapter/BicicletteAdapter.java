package adapter;

public class BicicletteAdapter implements Vehicule {
    Bicyclete b;

    public BicicletteAdapter(Bicyclete b){
        this.b = b;
    }
    @Override
    public void accelerer() {
        this.b.pedal();
    }

    @Override
    public void stop() {
        this.b.stop();
    }
}
