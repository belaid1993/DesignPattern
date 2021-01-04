package observer;


import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

    private String name;
    private String availibility;
    private List<Observer> mesObserveer;

    public Product(String name) {
        this.name = name;
        this.mesObserveer = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer o) {
          this.mesObserveer.add(o);
    }

    @Override
    public void unSubscribe(Observer o) {
          this.mesObserveer.remove(o);
    }

    @Override
    public void notiFy() {
        for(Observer o:mesObserveer){
            o.update(availibility);
        }
    }

    public void setAvailibility(boolean availibility) {
        this.availibility = this.name+" est "+(availibility?"disponible":"non disponible");
        notiFy();
    }
}
