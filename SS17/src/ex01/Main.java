package ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = inputNum(sc);
        int num2 = inputNum(sc);
        int sum = num1 + num2;
        System.out.println("Sum "+sum);
    }

    private static int inputNum(Scanner sc) {
        do{
            System.out.println("Enter the number");
            try{
                int num = Integer.parseInt(sc.nextLine());
                return num;
            }catch (Exception e){
                System.err.println("Must be a number");;
            }
        }while(true);
    }
}
