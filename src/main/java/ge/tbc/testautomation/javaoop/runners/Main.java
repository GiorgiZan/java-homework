package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;
import ge.tbc.testautomation.javaoop.figures.Circle;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(42);
        Rectangle rectangle = new Rectangle(24, 42);

        FigurePair<Circle, Rectangle> figurePair = new FigurePair<>(circle, rectangle);

        System.out.println(figurePair);

        AnyPair<Field[], Field[]> fieldsPair = getDeclaredFields(420, "Turtle");

        List<Field> fieldsObjOne = Arrays.asList(fieldsPair.getElementOne());
        List<Field> fieldsObjTwo = Arrays.asList(fieldsPair.getElementTwo());

        System.out.println("\nFields in elementOne:\n" + fieldsObjOne );

        System.out.println("\nFields in elementTwo:\n" + fieldsObjTwo );



    }

    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo) {
        Field[] fieldsObjOne = objOne.getClass().getDeclaredFields();
        Field[] fieldsObjTwo = objTwo.getClass().getDeclaredFields();

        return new AnyPair<>(fieldsObjOne, fieldsObjTwo);
    }


}
