package designPatterns.behavioral;

public class NetBankingPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using Net banking");
    }
}
