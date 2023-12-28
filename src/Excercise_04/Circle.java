package Excercise_04;

public class Circle extends Shape {
    static double radius;

    public Circle(double r) {
        this.radius = r;
    }


    static double calculateArea() {
        return Math.PI * radius * radius;
    }
}
