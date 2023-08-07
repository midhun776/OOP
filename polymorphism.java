//Abstraction

import java.util.Scanner;

abstract class Shape {
    abstract public double area();
}


class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return 3.14 * radius * radius;
    }
}


class Rectangle extends Shape {
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double area() {
        return length * width;
    }
}


class Triangle extends Shape {
    private double base;
    private double height;


    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double area() {
        return 0.5 * base * height;
    }
}


public class polymorphism {
    public static void main(String[] args) {


        int option = 0;
        Scanner sc = new Scanner(System.in);


        while(option!=4){


            System.out.println("\nAll Shape: \n1. Circle\n2. rectangle\n3. Triangle\nChoose your Option: ");
            option = sc.nextInt();


            switch (option) {
            case 1:
                System.out.println("Enter the radius of the Circle: ");
                double r = sc.nextInt();
                Shape circle = new Circle(r);
                System.out.println("Area of Circle: " + circle.area());
                break;
            case 2:
                System.out.println("Enter the length of the Rectangle: ");
                double l = sc.nextInt();
                System.out.println("Enter the breadth of the Rectangle: ");
                double w = sc.nextInt();
                Shape rectangle = new Rectangle(l,w);
                System.out.println("Area of Rectangle: " + rectangle.area());
                break;
            case 3:
                System.out.println("Enter the base of the Triangle: ");
                double b = sc.nextInt();
                System.out.println("Enter the height of the Triangle: ");
                double h = sc.nextInt();
                Shape triangle = new Triangle(b,h);
                System.out.println("Area of Triangle: " + triangle.area());
                break;
            case 4:
                System.out.println("Thank You!\nQuitting the program.......");
                return;
            default:
                System.out.println("Invalid option");
                break;
            }
        }
    }
}
