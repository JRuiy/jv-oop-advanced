package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseShort;
    private double baseLong;
    private double height;

    public IsoscelesTrapezoid(String color, double baseShort, double baseLong, double height) {
        super(color);
        this.baseShort = baseShort;
        this.baseLong = baseLong;
        this.height = height;
    }

    public double getBaseShort() {
        return baseShort;
    }

    public void setBaseShort(double baseShort) {
        this.baseShort = baseShort;
    }

    public double getBaseLong() {
        return baseLong;
    }

    public void setBaseLong(double baseLong) {
        this.baseLong = baseLong;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: isosceles trapezoid,"
                + "  area: " + gerArea() + " units,"
                + " baseShort: " + getBaseShort() + " units,"
                + " baseLong: " + getBaseLong() + " units,"
                + " height: " + getHeight() + " units,"
                + " color: " + getColor());
    }

    @Override
    public double gerArea() {
        return (getBaseLong() + getBaseShort()) * (getHeight() / 2);
    }
}