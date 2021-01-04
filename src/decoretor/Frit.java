package decoretor;

public class Frit extends SandwichDecorator{


    public Frit(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Frit";
    }

    @Override
    public int getPrix() {
        return super.getPrix() + 5;
    }
}
