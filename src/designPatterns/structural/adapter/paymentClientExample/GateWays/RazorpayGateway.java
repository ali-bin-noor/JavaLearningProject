package designPatterns.structural.adapter.paymentClientExample.GateWays;

public class RazorpayGateway {

    public boolean performTransaction(Double amount, Double cId) {
        // Razorpay's Payment Logic
        return true;
    }

}
