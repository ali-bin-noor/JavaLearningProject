package designPatterns.structural.adapter.paymentClientExample.adapter;

import designPatterns.structural.adapter.paymentClientExample.GateWays.RazorpayGateway;
import designPatterns.structural.adapter.paymentClientExample.PaymentService;

public class RazorpayAdapter implements PaymentService {
    private RazorpayGateway razorpayGateway;

    public RazorpayAdapter(RazorpayGateway razorpayGateway) {
        this.razorpayGateway = razorpayGateway;
    }


    @Override
    public String pay(int amount, int customerId) {
        Boolean result = razorpayGateway.performTransaction(Double.valueOf(124313), Double.valueOf(345));
        if (result) {
            return "SUCCESS";
        }
        return "FAILED";
    }
}
