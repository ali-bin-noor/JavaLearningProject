package designPatterns.structural.adapter.paymentClientExample.adapter;

import designPatterns.structural.adapter.paymentClientExample.GateWays.PaypalGateway;
import designPatterns.structural.adapter.paymentClientExample.PaymentService;

public class PaypalAdapter implements PaymentService {
    private PaypalGateway paypalGateway;

    public PaypalAdapter(PaypalGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }


    @Override
    public String pay(int amount, int customerId) {
        int result = paypalGateway.doTransaction(Double.valueOf(100343), 2);
        if (result == 1) {
            return "SUCCESS";
        }
        return "FAILED";
    }
}
