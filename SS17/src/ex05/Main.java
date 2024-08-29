package ex05;

import java.util.Arrays;
import java.util.Scanner;

import static ex02.Main.inputNum;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {16, 20, 43, 14, 5, 63, 7, 8, 98, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the number you want to search: ");
        int number = inputNum(sc);
//        sort arr
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        try{
            System.out.println(arr[binarySearch(arr, number, 0, arr.length-1)]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.err.println(number+" not found");
        }
    }
    public static int binarySearch(int[] arr, int num, int start, int end) {
        if (start > end) {
            return -1;
        }
        if (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == num) {
                return mid;
            }else if (arr[mid] > num) {
                return binarySearch(arr, num, start, mid-1);
            } else {
                return binarySearch(arr, num, mid+1, end);
            }
        }
        return -1;
    }
}
