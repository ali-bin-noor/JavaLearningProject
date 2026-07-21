package designPatterns.behavioral;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using Upi Payment");
    }
}
