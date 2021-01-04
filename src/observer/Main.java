package observer;

public class Main {

    public static void main(String[] args) {

        Product p = new Product("apple");
        Person pr = new Person("hadouti");

        p.subscribe(pr);
        p.subscribe(new Person("oussama"));
        p.subscribe(new Person("hakim"));
        p.unSubscribe(pr);


        p.setAvailibility(true);



    }
}
