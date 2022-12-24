package core.basesyntax;

public class Rectangle extends Figure {
    private double sideShort;
    private double sideLong;

    public Rectangle(String color, double sideShort, double sideLong) {
        super(color);
        this.sideShort = sideShort;
        this.sideLong = sideLong;
    }

    public double getSideShort() {
        return sideShort;
    }

    public void setSideShort(double sideShort) {
        this.sideShort = sideShort;
    }

    public double getSideLong() {
        return sideLong;
    }

    public void setSideLong(double sideLong) {
        this.sideLong = sideLong;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: rectangle," + "  area: "
                + gerArea() + " units," + " sideShort: "
                + getSideShort() + " units," + " sideLong: "
                + getSideLong() + " color: " + getColor());
    }

    @Override
    public double gerArea() {
        return getSideLong() * getSideShort();
    }
}