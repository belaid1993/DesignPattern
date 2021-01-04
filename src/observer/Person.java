package observer;

public class Person implements Observer {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Mr "+name+ " Ce Produit "+message);
    }
}
