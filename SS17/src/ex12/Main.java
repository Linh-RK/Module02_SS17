package ex12;

import java.util.Scanner;

import static ex02.Main.inputNum;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = inputNum(sc);
        System.out.println("Enter the second number:");
        int num2 = inputNum(sc);
        if (num1 ==  0 && num2 == 0) {
            throw new NumberFormatException("Err");
        }else {
            System.out.println("Uoc chung lon nhat"+findBruteForce(num1, num2));;
        }
    }
    public static int findBruteForce(int num1, int num2) {
        int brute = 1;
        int max = Math.max(num1, num2);
        for ( int i = max; i>1; i--) {
            if(num1 % i == 0 && num2 % i == 0) {
                brute = i;
                break;
            }
        }
        return brute;
    }
}
