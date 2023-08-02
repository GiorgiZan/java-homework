package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidCircle;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

public class Circle extends Figure implements IResizableCircle, IValidCircle, Comparable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        System.out.println("Package name: " + this.getClass().getPackageName());

    }

    @Override
    public Circle returnDoubleSizedCircle(Circle circle) {
        return new Circle(circle.radius * 2);
    }
    @Override
    public Circle returnCustomSizedCircle(Circle circle, double byValue) {
        return new Circle(circle.radius * byValue);
    }

    @Override
    public boolean validateCircle(Circle circle) {
        return circle.getRadius() > 0;
    }


    // 6) start
    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }

    // 6) THIS ONE IS 6 TOO
    @Override
    public int compareTo(Object o) {
        Circle other = (Circle) o;
        if (this.radius > other.radius) {
            return 1;
        } else if (this.radius < other.radius) {
            return -1;
        } else {
            return 0;
        }
    }



    //    public Circle(double radius) {
//        if (numberOfInstances > 5) {
//            throw new LimitException("INSTANTIATION LIMIT REACHED");
//        }
//
//        if (radius < 0) {
//            throw new RadiusException("RADIUS VALUE NOT VALID");
//        }
//
//        this.radius = radius;
//    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



}