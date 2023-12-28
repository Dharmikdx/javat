package Excercise_04;

public class Main_Exercise_04 {

    public static void main(String[] args) {
        double r = 4.0;
        double length=2, width=3;
        Circle circle = new Circle(r);
        Rectangle rect = new Rectangle(length,width);
        System.out.println("Area of the Circle: " + Circle.calculateArea());
        System.out.println("Area of the Rectangle: " + Rectangle.calculateArea());
    }
}
