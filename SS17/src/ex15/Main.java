package ex15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter the second side of the triangle: ");
        double side2 = scanner.nextDouble();
        System.out.println("Enter the third side of the triangle: ");
        double side3 = scanner.nextDouble();

        if(side1 + side2 <= side3||side2 + side3 <= side1||side3 + side1 <= side2){
            throw new ArithmeticException(side1+", " +side2+", " +side3+" aren't a triangle's side " );
        }
    }
}
