package Introduction;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] myIntArray1 = {100, 90};
//        myIntArray1 = new int[10];
//
//        myIntArray1[0] = 100;
//        myIntArray1[1] = 90;

        System.out.println("0 Index: " + myIntArray1[0]);
        System.out.println("1st Index: " + myIntArray1[1]);
//        System.out.println("2nd Index: " + myIntArray1[2]);

        String[] myStringArray1 = {"bmw", "audi", "honda"};
        System.out.println("0 Index: " + myStringArray1[0]);
        System.out.println("1st Index: " + myStringArray1[1]);
//        System.out.println("2nd Index: " + myStringArray1[2]);

        int len = myIntArray1.length;
        int len1 = myStringArray1.length;

        System.out.println("1st Array length: " + len);
        System.out.println("2nd Array length: " + len1);

        for (int i = 0; i <= len; i++) {
            System.out.println(myIntArray1[i]);
        }

        Arrays.sort(myIntArray1);

        for (int i = 0; i <= len1; i++) {
            System.out.println(myIntArray1[i]);
        }


    }
}
