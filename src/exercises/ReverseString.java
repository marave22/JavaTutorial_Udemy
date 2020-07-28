package exercises;

public class ReverseString {

    public static void main(String[] args) {
        String input = "this is a test string";
        String output = reverse(input);
        System.out.println(input);
        System.out.println(output);
    }

    private static String reverse(String input) {
        String reverse = "";

        if (input.isEmpty() || input == null) {
            System.out.println("Empty and null strings are not accepted");
        }

        if (input.length() <= 1) {
            reverse = input;
        } else {
            String[] originalArray = input.split("\\s+");
            for (String item : originalArray) {
              reverse = item + " " + reverse;
        }
            return reverse;
        }
        return reverse.trim();
    }
}
