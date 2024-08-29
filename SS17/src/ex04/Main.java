package ex04;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string of number");
        String string = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            try{
                list.add(Integer.parseInt(String.valueOf(string.charAt(i))));
            }
            catch (NullPointerException e){
                list.add(0);
                System.out.println(e.getMessage());
            }
        }
        System.out.println(list);
    }
}
