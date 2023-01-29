import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Circle> circleList = new ArrayList<>();
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(8, "Blue");

        circleList.add(circle1);
        circleList.add(circle2);
        circleList.add(circle3);

        for (int i=0; i<circleList.size(); i++) {
            int radius = circleList.get(i).getRadius();
            String color = circleList.get(i).getColor();

            System.out.print("Area of the circle #" + (i+1) + " is: ");
            System.out.printf("%.2f", circleList.get(i).getArea(radius));
            System.out.println(" " + circleList.get(i).toString(radius, color));
        }
    }
}