package factoryExemple2;

public class App {
    public static void main(String[] args) {

        Sandwich s = SandwichFactory.createSandwich(SandwichFactory.CHEESE_BURGER);
        s.prepare();

    }
}
