package ex08;

import java.util.InputMismatchException;
import java.util.Scanner;

import static ex02.Main.inputNum;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = inputNum(sc);
        if (number<2) {
            throw new InputMismatchException("Invalid number");
        } else if (number == 2) {
            System.out.println(" 2 is prime");
        } else{
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number +" Prime number");
            }else {
                System.out.println(number +" Not Prime number");
            }
        }
    }
}
