package factoryExemple2;

public class SandwichFactory {

    public final static int CHIKEN_BURGER = 1;
    public final static int CHEESE_BURGER = 2;


    public static Sandwich createSandwich(int sandwichId) {
        switch (sandwichId) {
            case CHEESE_BURGER:
                return new CheeseBurger();
            case CHIKEN_BURGER:
                return new ChikenBurger();
            default:
                return null;
        }
    }
}
