package designPrinciples.openClosedPrinciple.OCPExample;

public class CreditCard implements Payment{
    @Override
    public void doTransaction() {
        System.out.println("Doing transaction using credit card....");
    }
}
