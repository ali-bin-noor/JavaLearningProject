package designPatterns.behavioral.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.setPaymentStrategy(new CreditCardPayment());
        processor.makePayment(5000);

        processor.setPaymentStrategy(new NetBankingPayment());
        processor.makePayment(7000);

        processor.setPaymentStrategy(new UpiPayment());
        processor.makePayment(90000);



    }
}
