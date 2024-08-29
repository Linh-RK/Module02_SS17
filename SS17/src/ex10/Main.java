package ex10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = inputR(scanner);
        double area = Math.PI * r * r;
        System.out.println(Math.round(area*100)/100.0);
    }

    private static double inputR(Scanner scanner) {
        System.out.println("Enter the radius of a circle: ");
        try{
            double radius = Double.parseDouble(scanner.nextLine());
            if (radius <= 0) {
                throw new NumberFormatException("Radius must be greater than 0");
            }else {
                return radius;
            }
        }catch (NumberFormatException e){
            throw new NumberFormatException("The radius of a circle must be a number");
        }
    }
}
