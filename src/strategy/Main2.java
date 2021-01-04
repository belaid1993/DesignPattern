package strategy;

public class Main2 {

    public static void main(String[] args) {

        Article a = new Article("apple",1000);
        Article b = new Article("samsung",500);

        a.payer(new PaypalStrategy("reda","123"));
        b.payer(new CarteDeCreditStrategy("123","BAE","12/12/2020"));

    }
}
