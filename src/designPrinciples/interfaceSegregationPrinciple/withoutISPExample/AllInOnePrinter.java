package designPrinciples.interfaceSegregationPrinciple.withoutISPExample;

public class AllInOnePrinter implements Machine {
    @Override
    public void print() {
        //Printing functionality
    }

    @Override
    public void scan() {
        //Scanning functionality
    }

    @Override
    public void fax() {
        //Fax functionality
    }
}
