package strategy;

public class Article  {

    private String nom;
    private int prix;

    public Article(String nom, int prix){
        this.nom = nom;
        this.prix = prix;
    }

    public int getPrix() {
        return prix;
    }

    public void payer(PaymentStrategy p){
          p.payer(this.getPrix());
    }

}
