package strategy;

public class CarteDeCreditStrategy implements PaymentStrategy {

    private String numeroCarte;
    private String cryptogramme;
    private String dateExpiration;

    public CarteDeCreditStrategy(String numeroCarte, String cryptogramme, String dateExpiration) {
        this.numeroCarte = numeroCarte;
        this.cryptogramme = cryptogramme;
        this.dateExpiration = dateExpiration;
    }


    @Override
    public void payer(int montant) {
        System.out.println(montant+" est payer par Carte crédit");
    }
}
