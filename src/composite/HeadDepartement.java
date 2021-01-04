package composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartement implements Departement {

    private String name;
    private int id;
    List<Departement> maList;

    public HeadDepartement(String name, int id) {
        this.name = name;
        this.id = id;
        this.maList = new ArrayList<>();
    }

    public void add(Departement d){
        this.maList.add(d);
    }

    public void remove(Departement d){
        this.maList.remove(d);
    }

    @Override
    public void printDepartementName() {
        this.maList.forEach(Departement::printDepartementName);
    }
}
