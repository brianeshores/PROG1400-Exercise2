import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Circle> circleList = new ArrayList<>();
        Circle circle1 = new Circle();
        circleList.add(circle1);
        Circle circle2 = new Circle(5);
        circleList.add(circle2);
        Circle circle3 = new Circle(8, "Blue");
        circleList.add(circle3);

        for (Circle circle : circleList) {
            System.out.print("Area of the circle is: ");
            System.out.printf("%.2f", circle.getArea(circle.getRadius()));
            System.out.println(circle.toString(circle.getRadius(), circle.getColor()));
        }
    }
}