import figures.Figure;

public class Circle extends Figure {
    private int radius;
    double pi = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double area() {
        return pi * radius * radius;
    }
}
