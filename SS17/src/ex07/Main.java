package ex07;

import java.util.Scanner;

import static ex02.Main.inputNum;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = inputNum(sc);
        System.out.println("Enter number 2: ");
        int num2 = inputNum(sc);
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else
            System.out.println(num1 + " is equal to " + num2);
    }
}
