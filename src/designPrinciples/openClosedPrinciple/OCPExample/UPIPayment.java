package designPrinciples.openClosedPrinciple.OCPExample;

public class UPIPayment implements Payment{
    @Override
    public void doTransaction() {
        System.out.println("Doing transaction using UPIPayment.....");
    }
}
