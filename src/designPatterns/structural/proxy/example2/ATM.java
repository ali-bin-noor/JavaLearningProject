package designPatterns.structural.proxy.example2;

public class ATM implements Account{

    @Override
    public void withdraw() {

        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw();

    }

    @Override
    public void getAccountNumber() {

    }
}
