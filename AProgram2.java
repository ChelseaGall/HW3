import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chelsea Gallimore
 */
public class AProgram2 {



    public static void main(String[] args) {

        // Scanner object to read user inputs
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape\n");
        System.out.println("[1] Square");
        System.out.println("[2] Rectangle");
        System.out.println("[3] Circle");

        System.out.print("\nEnter your choice 1 2 or 3: ");
        int choice = scanner.nextInt();
        double area, perimeter;

        // when user choose option 1
        if (choice == 1) {
            System.out.println("Enter the side length of the square: ");
            double side = scanner.nextDouble();
            area = side * side;
            perimeter = 4 * side;
            System.out.printf("Area: %.2f, Perimeter: %.2f\n", area, perimeter);
        }

        // when user choose option 2
        else if (choice == 2) {
            System.out.println("Enter the length and width of the rectangle: ");
            double length = scanner.nextDouble();
            double width = scanner.nextDouble();
            area = length * width;
            perimeter = 2 * (length + width);
            System.out.printf("Area: %.2f, Perimeter: %.2f\n", area, perimeter);
        }
        
        
        // when user choose option 3
        else if (choice == 3) {
            System.out.println("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            area = Math.PI * radius * radius;
            perimeter = 2 * Math.PI * radius;
            System.out.printf("Area: %.2f, Perimeter: %.2f\n", area, perimeter);
        } 
        
        // if user enters any number other than 1 2 or 3
        else {
            System.out.println("Invalid choice.");
        }
    }
}