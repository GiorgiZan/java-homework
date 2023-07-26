package src.main.java.ge.tbc.testautomation.javaoop.runners;

import src.main.java.ge.tbc.testautomation.javaoop.figures.Circle;
import src.main.java.ge.tbc.testautomation.javaoop.util.Util;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.3);
        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
        Circle circle2 = new Circle(4.51);
        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
        Circle circle3 = new Circle(5.131);
        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
        Circle circle4 = new Circle(12.1);
        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
        Circle circle5 = new Circle(13.4);
        // ვთქვათ circle5-ის მნიშვნელობის შეცვლა მოგვინდა
        circle5.setRadius(24);
        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);

        String circle1ToString = Util.circleToString(circle1);
        String circle2ToString = Util.circleToString(circle2);
        String circle3ToString = Util.circleToString(circle3);
        String circle4ToString = Util.circleToString(circle4);
        String circle5ToString = Util.circleToString(circle5);

        System.out.println("Circle 1 - " + circle1ToString);
        System.out.println("Circle 2 - " + circle2ToString);
        System.out.println("Circle 3 - " + circle3ToString);
        System.out.println("Circle 4 - " + circle4ToString);
        System.out.println("Circle 5 - " + circle5ToString);


        System.out.println("\n !!!!! BONUS !!!!! \n");
        // ბონუს არასავალდებულო დავალება
        Circle circle6Random = new Circle(Math.random() * 10);
        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
        Circle circle7Random = new Circle(Math.random() * 10);
        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
        Circle circle8Random = new Circle(Math.random() * 10);
        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
        Circle circle9Random = new Circle(Math.random() * 10);
        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);
        Circle circle10Random = new Circle(Math.random() * 10);
        System.out.println("Number of Circle instances - " + Circle.numberOfCircleInstances);


        String circle6RandomToString = Util.circleToString(circle6Random);
        String circle7RandomToString = Util.circleToString(circle7Random);
        String circle8RandomToString = Util.circleToString(circle8Random);
        String circle9RandomToString = Util.circleToString(circle9Random);
        String circle10RandomToString = Util.circleToString(circle10Random);

        System.out.println("Circle 6 (random) - " + circle6RandomToString);
        System.out.println("Circle 7 (random) - " + circle7RandomToString);
        System.out.println("Circle 8 (random) - " + circle8RandomToString);
        System.out.println("Circle 9 (random) - " + circle9RandomToString);
        System.out.println("Circle 10 (random) - " + circle10RandomToString);
    }




}
