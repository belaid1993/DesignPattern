package decoretor;

public class Main {
    public static void main(String[] args) {

     Sandwich s = new Frit(new Frit(new BasicSandwich()));

     System.out.println("Description : " + s.getDescription());
        System.out.println("Prix : "+s.getPrix());

    }
}
