package core.basesyntax;

public abstract class Figure implements CalculateArea {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract String display();
}