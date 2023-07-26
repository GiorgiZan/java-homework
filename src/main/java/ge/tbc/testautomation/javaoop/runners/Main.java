package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
import ge.tbc.testautomation.javaoop.util.Util;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(7.0, 10.0);
        Rectangle rectangle2 = new Rectangle(2.0, 5.0);

        Triangle triangle1 = new Triangle(3.0, 4.0, 5.0 );
        Triangle triangle2 = new Triangle(6.0, 8.0, 10.0, 3);

        System.out.println("Rectangle 1 Area: " + rectangle1.getArea());
        System.out.println("Rectangle 2 Area: " + rectangle2.getArea());

        System.out.println("Rectangle 1 Perimeter: " + rectangle1.getPerimeter());
        System.out.println("Rectangle 2 Perimeter: " + rectangle2.getPerimeter());

        System.out.println("Triangle 1 Area: " + triangle1.getArea());
        System.out.println("Triangle 2 Area: " + triangle2.getArea());

        System.out.println("Triangle 1 Perimeter: " + triangle1.getPerimeter());
        System.out.println("Triangle 2 Perimeter: " + triangle2.getPerimeter());


        System.out.println("\n !!!!! BONUS !!!!! \n");
        HelperFunctions.compareRectangles(rectangle1, rectangle2);








//        Circle circle1 = new Circle(3.3);
//        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
//        Circle circle2 = new Circle(4.51);
//        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
//        Circle circle3 = new Circle(5.131);
//        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
//        Circle circle4 = new Circle(12.1);
//        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
//        Circle circle5 = new Circle(13.4);
//        // ვთქვათ circle5-ის მნიშვნელობის შეცვლა მოგვინდა
//        circle5.setRadius(24);
//        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
//
//        String circle1ToString = Util.circleToString(circle1);
//        String circle2ToString = Util.circleToString(circle2);
//        String circle3ToString = Util.circleToString(circle3);
//        String circle4ToString = Util.circleToString(circle4);
//        String circle5ToString = Util.circleToString(circle5);
//
//        System.out.println("Circle 1 - " + circle1ToString);
//        System.out.println("Circle 2 - " + circle2ToString);
//        System.out.println("Circle 3 - " + circle3ToString);
//        System.out.println("Circle 4 - " + circle4ToString);
//        System.out.println("Circle 5 - " + circle5ToString);
//
//
//        System.out.println("\n !!!!! BONUS !!!!! \n");
//        // ბონუს არასავალდებულო დავალება
//        Circle circle6Random = new Circle(Math.random() * 10);
//        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
//        Circle circle7Random = new Circle(Math.random() * 10);
//        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
//        Circle circle8Random = new Circle(Math.random() * 10);
//        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
//        Circle circle9Random = new Circle(Math.random() * 10);
//        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
//        Circle circle10Random = new Circle(Math.random() * 10);
//        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
//
//
//        String circle6RandomToString = Util.circleToString(circle6Random);
//        String circle7RandomToString = Util.circleToString(circle7Random);
//        String circle8RandomToString = Util.circleToString(circle8Random);
//        String circle9RandomToString = Util.circleToString(circle9Random);
//        String circle10RandomToString = Util.circleToString(circle10Random);
//
//        System.out.println("Circle 6 (random) - " + circle6RandomToString);
//        System.out.println("Circle 7 (random) - " + circle7RandomToString);
//        System.out.println("Circle 8 (random) - " + circle8RandomToString);
//        System.out.println("Circle 9 (random) - " + circle9RandomToString);
//        System.out.println("Circle 10 (random) - " + circle10RandomToString);
    }




}
