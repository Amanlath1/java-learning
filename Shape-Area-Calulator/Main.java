public class Main {
    public static void main(String[] args) {
//        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle = new Rectangle(5.0, 3.0);

//        Circle circle = new Circle();
        Circle circle1 = new Circle(5.0);

        double areaOfRectangle = ShapeMetricCalculator.calculateRectangleArea(rectangle);
        double areaOfCircle = ShapeMetricCalculator.calculateCircleArea(circle1);

        System.out.println("Area of rectangle is: " + areaOfRectangle);
        System.out.println("Area of Circle is: " + areaOfCircle);
    }
}
