package Excercise_04;


public class Rectangle {

    static double length;
    static double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    static double calculateArea() {
        return length * width;
    }
}
