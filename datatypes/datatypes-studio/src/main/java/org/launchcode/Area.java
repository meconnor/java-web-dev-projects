package org.launchcode;



import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        input.close();

        double Area = Circle.getArea(radius);

        System.out.println("Area of circle is: " + Area);

    }

}
