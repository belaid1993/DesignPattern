package decoretor;

public class BasicSandwich implements Sandwich{


    @Override
    public int getPrix() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Pain";
    }
}
