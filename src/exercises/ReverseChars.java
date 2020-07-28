package exercises;

import java.util.Scanner;

public class ReverseChars {

//    public static void main(String[] args) {
//        String input = "this is a test string";
//        String output = reverse(input);
//        System.out.println(input);
//        System.out.println(output);
//    }
//
//    private static String reverse(String input) {
//        String reverse = "";
//
//        if (input.isEmpty() || input == null) {
//            System.out.println("Empty and null strings are not accepted");
//        }
//
//        if (input.length() <= 1) {
//            reverse = input;
//        } else {
//            String[] originalArray = input.split("\\s+");
//            for (String item : originalArray) {
//                byte []  strAsByteArray = item.getBytes();
//                byte [] result = new byte [strAsByteArray.length];
//
//                for (int i = 0; i < strAsByteArray.length; i++) {
//                    result[i] = strAsByteArray[strAsByteArray.length - i - 1];
//                }
//                reverse = new String(result) + " " + reverse;
//            }
//            return reverse;
//        }
//        return reverse.trim();
//    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String original = scan.nextLine();

        while (original.isEmpty() || original == null) {
            System.out.println("Please enter a valid string, empty and null strings are not accepted: ");
            original = scan.nextLine();
        }
        scan.close();

        ReverseChars output = new ReverseChars();
        String reverseCharacters = output.reverseChars(original);
        System.out.println(reverseCharacters);
    }

    private String reverseChars (String originalString) {
        String reverse = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reverse = reverse + " " + originalString.charAt(i);
        }

        return reverse;
    }

}
