package com.codegym;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        Rectangle rectangle = new Rectangle(20,10);
        Square square = new Square(30);


        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);


        circle.resize(50);
        rectangle.resize(50);
        square.resize(50);


        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

    }
}
