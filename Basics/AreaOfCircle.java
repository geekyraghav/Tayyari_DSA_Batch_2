package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        // Program to calculate area of circle
        Scanner sc = new Scanner(System.in); // only once
        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();
        double area = 3.141592*radius*radius;
        System.out.print("Area is: "+area);
    }
}
