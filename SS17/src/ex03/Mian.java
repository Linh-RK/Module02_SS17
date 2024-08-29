package ex03;

import java.util.Scanner;

public class Mian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,5,8,4,2,20};
        int sum = 0;
            for(int i = 0 ; i < arr.length ; i++){
                try{
                    sum += arr[i];
                }catch (Exception e){
                    System.err.println(arr[i]+"Khong phai so nguyen");
                }
            }
        System.out.println(sum);
    }
}
