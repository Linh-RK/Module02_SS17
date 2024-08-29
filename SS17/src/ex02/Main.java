package ex02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int length = inputNum(sc);
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number " + i + ":");
             arr[i]=inputNum(sc);
        }
        if(arr.length==0){
            throw new Exception("Array is blank !");
        } else {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(arr[i]>max){
                    max = arr[i];
                }
            }
            System.out.println("The max number is " + max);
        }
    }

    public static int inputNum(Scanner sc) {
        do {
            try {
                int num = Integer.parseInt(sc.next());
                return num;
            } catch (NumberFormatException e) {
                System.err.println("Invalid number");
            }
        } while (true);
    }
}
