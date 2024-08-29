package ex06;

import java.util.Scanner;

import static ex02.Main.inputNum;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int num1 = inputNum(sc);
        System.out.println("Enter number 2: ");
        int num2 = inputNum(sc);

        if(num2!= 0){
            double div = (double) num1 / num2;
            System.out.println(div);
        }else {
            System.err.println("Error: số chia bằng 0");
        }

    }
}
