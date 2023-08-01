package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Figure;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle(5);

        double area = circle.getArea();
        double length = circle.getLength();

        System.out.println("Circle Area: " + area);
        System.out.println("Circle Length: " + length);

        Circle doubleSizedCircle = circle.returnDoubleSizedCircle(circle);
        Circle customSizedCircle = circle.returnCustomSizedCircle(circle, 3);

        System.out.println("Double Sized Circle Radius: " + doubleSizedCircle.getRadius());
        System.out.println("Custom Sized Circle Radius: " + customSizedCircle.getRadius());

        boolean isValid = circle.validateCircle(circle);
        System.out.println("Is this Circle valid: " + isValid);


        circle.printPackageName();

    }




}
