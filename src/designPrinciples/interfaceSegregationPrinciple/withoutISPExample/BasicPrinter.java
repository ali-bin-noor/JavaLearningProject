package designPrinciples.interfaceSegregationPrinciple.withoutISPExample;

public class BasicPrinter implements Machine {
    @Override
    public void print() {
        //Printing functionality
    }

    @Override
    public void scan() {
        //Problem: Basic printer can't scan!
        throw new UnsupportedOperationException("Cannot scan");
    }

    @Override
    public void fax() {
        //Problem: Basic printer can't fax!
        throw new UnsupportedOperationException("Cannot fax");
    }
}
