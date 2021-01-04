package decoretor;

public class SandwichDecorator implements Sandwich{

    private Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }


    @Override
    public int getPrix() {
        return this.sandwich.getPrix();
    }

    @Override
    public String getDescription() {
        return this.sandwich.getDescription();
    }
}
