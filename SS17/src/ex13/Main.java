package ex13;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string= inputString(scanner);

        List<String> arr = Arrays.stream(string.split("")).toList();
//        System.out.println(arr);
        List<String> reversedArr = arr.reversed();
        String reversedString = String.join("", reversedArr);
        System.out.println(reversedString);

    }

    private static String inputString(Scanner scanner) {
        do {
            System.out.println("Enter a string: ");
            String string = scanner.nextLine();
            if(string.isBlank()){
                throw new RuntimeException("Data cannot be empty");
            }else
                return string;
        }while (true);
    }
}
