package designPrinciples.openClosedPrinciple.withoutOCPExample;

public class Shape {

    private String type;

    private double area;

    public double calculateArea() {
        if (type.equalsIgnoreCase("circle")) {
            System.out.println("Calculating circle area.");
            return area;
        } else if (type.equalsIgnoreCase("rectangle")) {
            System.out.println("Calculating rectangle area.");
            return area;
        }
        return area;
    }
}
