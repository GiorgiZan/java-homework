package ge.tbc.testautomation.javaoop.figures;

public class Rectangle extends Figure  {
    private double a;
    private double b;


    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public String toString() {
        return "Rectangle{" + "a=" + a + ", b=" + b + '}';
    }
        @Override
    public double getArea() {
        return a * b;
    }
    @Override
    public double getLength() {
        return 2 * (a + b);
    }

    @Override
    public void printPackageName() {
        System.out.println("Package name: " + this.getClass().getPackageName());
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
