package driver;

import java.util.Scanner;

import model.Circle;
import model.Shape;

public class ShapeCalculatorDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        Shape circle = new Circle(radius);

        System.out.println("circle area: " + calculateArea(circle));

        scanner.close();
    }

    private static double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}
