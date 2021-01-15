package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.setColor("red");
        System.out.println("A Circle: " + circle.toString());
        System.out.println("The radius is: " + circle.getRadius());
        System.out.println("The Area is: " + circle.getArea());
        System.out.println("The Diameter is: " + circle.getDiameter());
        System.out.println("The Perimeter is: " + circle.getPerimeter());
        System.out.println();

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("A Rectangle: " + rectangle.toString());
        System.out.println("The area is: " + rectangle.getArea());
        System.out.println("The perimeter is: " + rectangle.getPerimeter());
    }
}
