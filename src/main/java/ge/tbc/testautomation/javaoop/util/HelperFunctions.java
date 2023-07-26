package ge.tbc.testautomation.javaoop.util;


import ge.tbc.testautomation.javaoop.figures.Rectangle;

public class HelperFunctions {
    // !!!!!!!!!!!! BONUS !!!!!!!!!!!!!!

    public static void compareRectangles(Rectangle rectangle1, Rectangle rectangle2) {
        double perimeter1 = rectangle1.getPerimeter();
        double perimeter2 = rectangle2.getPerimeter();

        if (perimeter1 > perimeter2) {
            System.out.println("parameter 1  >  parameter 2 ");
        } else if (perimeter1 < perimeter2) {
            System.out.println("parameter 1  <  parameter 2 ");
        } else {
            System.out.println("parameter 1  =  parameter 2 ");
        }


    }
}
