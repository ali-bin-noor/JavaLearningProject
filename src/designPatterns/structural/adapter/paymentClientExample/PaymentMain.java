package designPatterns.structural.adapter.paymentClientExample;

import designPatterns.structural.adapter.paymentClientExample.GateWays.PaypalGateway;
import designPatterns.structural.adapter.paymentClientExample.GateWays.RazorpayGateway;
import designPatterns.structural.adapter.paymentClientExample.adapter.PaypalAdapter;
import designPatterns.structural.adapter.paymentClientExample.adapter.RazorpayAdapter;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentClient paymentClient = new PaymentClient(new RazorpayAdapter(new RazorpayGateway()));
        PaymentClient paymentClient1 = new PaymentClient(new PaypalAdapter(new PaypalGateway()));
        paymentClient1.makePayment();
    }
}
