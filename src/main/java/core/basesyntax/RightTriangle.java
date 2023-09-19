package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String display() {
        return "Figure: right rectangle, area " + String.format("%.2f", calculateArea())
                + " sq. units, firstLeg " + firstLeg + " units, secondLeg "
                + secondLeg + " units, color: " + getColor();
    }
}