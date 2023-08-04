package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.annotationsAndComparators.Analyzable;
import ge.tbc.testautomation.annotationsAndComparators.Rectangle;
import ge.tbc.testautomation.annotationsAndComparators.RectangleComparator;
import ge.tbc.testautomation.annotationsAndComparators.VariableNameAnnotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        int unusedInt = 42;
        double unusedDouble = 3.14;


        Field[] fields = Analyzable.class.getDeclaredFields();
        for (Field field:
             fields) {
            if (field.isAnnotationPresent(VariableNameAnnotation.class)) {
                VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
                if (!field.getName().equalsIgnoreCase(annotation.name())){
                    System.out.println("VARIABLE NAME MISMATCH FOUND.");
                    continue;
                }
                System.out.println("Variable Name Match (ignoring case): "+ annotation.name() + " = " + field.getName());



            }
        }


        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(5);
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(4);
        integerArrayList.add(8);
        integerArrayList.add(3);
        integerArrayList.add(9);
        integerArrayList.add(7);
        integerArrayList.add(6);
        integerArrayList.add(10);

        Collections.sort(integerArrayList);
        System.out.println("\nSorted ArrayList: " + integerArrayList);


        ArrayList<Rectangle> rectangleList = new ArrayList<>();

        rectangleList.add(new Rectangle(3.5, 4.2));
        rectangleList.add(new Rectangle(2.2, 5.5));
        rectangleList.add(new Rectangle(6.0, 2.0));
        rectangleList.add(new Rectangle(4.0, 4.0));
        rectangleList.add(new Rectangle(1.0, 7.0));
        rectangleList.add(new Rectangle(5.0, 5.0));
        rectangleList.add(new Rectangle(2.5, 6.2));
        rectangleList.add(new Rectangle(3.0, 3.0));
        rectangleList.add(new Rectangle(4.5, 2.8));
        rectangleList.add(new Rectangle(2.8, 9.5));
        System.out.println("\nbefore: "+rectangleList);

        rectangleList.sort(new RectangleComparator());

        System.out.println("\nafter: "+rectangleList);








//
//        Circle circle = new Circle(5);
//
//        double area = circle.getArea();
//        double length = circle.getLength();
//
//        System.out.println("Circle Area: " + area);
//        System.out.println("Circle Length: " + length);
//
//        Circle doubleSizedCircle = circle.returnDoubleSizedCircle(circle);
//        Circle customSizedCircle = circle.returnCustomSizedCircle(circle, 3);
//
//        System.out.println("Double Sized Circle Radius: " + doubleSizedCircle.getRadius());
//        System.out.println("Custom Sized Circle Radius: " + customSizedCircle.getRadius());
//
//        boolean isValid = circle.validateCircle(circle);
//        System.out.println("Is this Circle valid: " + isValid);
//
//
//        circle.printPackageName();

    }




}
