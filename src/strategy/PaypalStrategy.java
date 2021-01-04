package strategy;

public class PaypalStrategy implements PaymentStrategy {

    private String user;
    private String pass;

    public PaypalStrategy(String user, String pass){
        this.user = user;
        this.pass = pass;
    }

    @Override
    public void payer(int montant) {
        System.out.println(montant+" est payer par paypal");
    }
}
