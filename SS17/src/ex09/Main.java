package ex09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static ex02.Main.inputNum;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        List<Integer> list = new ArrayList<Integer>(List.of(1,1));
        int number = inputNum(sc);
       if(number <=0){
          throw new ArithmeticException("Number must be positive");
       } else if(number == 1 || number == 2){
           System.out.println("Your number is 1");
       } else {
           int result;
           for(int i=2;i<=number; i++){
               result = list.get(i-2)+list.get(i-1);
               list.add(result);
           }
           list.forEach(i -> System.out.print(i+" "));
           System.out.println();
           System.out.println(list.get(list.size()-1));
       }

    }
}
