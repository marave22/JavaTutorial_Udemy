package Introduction;

public class ConditionalStatements {

    public static void main(String[] args) {

//        int val1 = 0;
//        int val2 = 10;

//        boolean condition = val1 == val2;
//        System.out.println(condition);

//        if (val1 < val2) {
//            System.out.println("Yes, true");
//        } else {
//            System.out.println("No, false");
//        }

        int score = 91;
        String grade;

        if (score > 90) {
            grade = "A";
        } else if (score > 80) {
            grade = "B";
        } else {
            grade = "C";
        }

        System.out.println("Score is: " + score);
        System.out.println("Grade is: " + grade);
    }

}
