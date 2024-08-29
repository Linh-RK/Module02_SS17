package ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ex02.Main.inputNum;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = inputNum(sc);
        if(number <= 0){
            throw new ArithmeticException();
        }else{
            Integer[] arr = new Integer[number];
            int sum = 0;
            for(int i = 1; i <= number; i++){
                System.out.println("Enter element " + i + " of array: ");
                 arr[i-1] = inputNum(sc);
                 sum += arr[i-1];
            }
            System.out.println("Average is " + (double)(sum/number));
        }
    }
}
