package P0061.Control;

import P0061.Model.Circle;
import P0061.Model.Rectangle;
import P0061.Model.Triangle;

public class HandleShape {

    public void content() {
        System.out.println("=====Calculator Shape Program=====");
        System.out.println("Please input side width of Rectangle:");
        double width = Validate.checkDouble();
        System.out.println("Please input side length of Rectangle:");
        double length = Validate.checkDouble();
        System.out.println("Please input radius of Circle:");
        double radius = Validate.checkDouble();
        System.out.println("Please input side A of Triangle:");
        double sideA = Validate.checkDouble();
        System.out.println("Please input side B of Triangle:");
        double sideB = Validate.checkDouble();
        System.out.println("Please input side C of Triangle:");
        double sideC = Validate.checkDouble();
        Rectangle r = new Rectangle(width, length);
        Circle c = new Circle(radius);
        Triangle t = new Triangle(sideA, sideB, sideC);
        r.printResult();
        c.printResult();
        t.printResult();
    }
}
