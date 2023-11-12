package Bank;

public class BancaTransilvania implements BankingSystem{

    private int sold;

    public BancaTransilvania(int sold) {
        this.sold = sold;
    }

    public int withdraw(int amount) {
        if (sold < amount) {
            System.out.println("Nu aveti suficient bani in banca");
            return sold;
        }
        sold = sold - amount;
        System.out.println(String.format("Am extras din banca %d si soldul ramas este de %d", amount, sold));
        return sold;
    }

    public int deposit(int amount) {
        sold = sold + amount;
        System.out.println(String.format("Am depus in banca %d si soldul actual este de %d", amount, sold));
        return sold;
    }
}
