public class ShapeMetricCalculator {

    public static double calculateRectangleArea(Rectangle rectangle){
        return rectangle.length * rectangle.width;
    }

    public static double calculateCircleArea(Circle circle){
        double area = (22.0/7.0)*(circle.radius * circle.radius);
        return area;
    }
}

