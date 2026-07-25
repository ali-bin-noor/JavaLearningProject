package designPrinciples.openClosedPrinciple.OCPExample;

public class Paypal implements Payment{
    @Override
    public void doTransaction() {
        System.out.println("Doing transaction using Paypal gateway...");
    }
}
