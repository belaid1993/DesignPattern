package composite;

public class FinancialDepartement implements Departement {

    private String name;
    private int id;

    public FinancialDepartement(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void printDepartementName() {
        System.out.println(getClass().getSimpleName());
    }
}
