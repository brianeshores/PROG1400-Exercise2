
public class Circle {
    private int radius;
    private String color;

    public Circle() {
        this.radius=2;
    }

    public Circle(int radius) {
        this.radius=radius;
    }

    public Circle(int radius, String color) {
        this.radius=radius;
        this.color=color;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea(int radius) {
        return Math.PI*(radius*radius);
    }

    public String toString(int radius, String color) {
        return ("Radius = " + radius + "  Color = " + color);
    }
}
