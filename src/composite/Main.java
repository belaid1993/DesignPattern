package composite;

public class Main {
    public static void main(String[] args) {

        SaleDepartement a = new SaleDepartement("Sale",1);
        FinancialDepartement b = new FinancialDepartement("fin",2);

        HeadDepartement c = new HeadDepartement("head",3);

        c.add(a);
        c.add(b);

        c.printDepartementName();

    }
}
