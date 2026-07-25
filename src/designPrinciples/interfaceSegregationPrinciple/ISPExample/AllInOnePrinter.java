package designPrinciples.interfaceSegregationPrinciple.ISPExample;

public class AllInOnePrinter implements Scanner,FaxMachine,Printer{
    @Override
    public void fax() {
        // Fax functionality
    }

    @Override
    public void print() {
        // Printing functionality
    }

    @Override
    public void scan() {
        // Scanning functionality
    }
}
