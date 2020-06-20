package Introduction;

public class Variables {

    public static void main(String[] args) {
        /*
         * Byte
         * Min: -128
         * Max: 127
         * Default: 0
         */
        byte byteVariable = 100;
        System.out.println("Byte Value: " + byteVariable);

        /*
         * Short
         * Min: -32,768
         * Max: 32,768
         * Default: 0
         */
        short shortVariable = 1000;
        System.out.println("Short Variable: " + shortVariable);
        /*
         * Int
         * Min: -2,147,483,648
         * Max: 2,147,483,647
         * Default: 0
         */
        int intVariable = 100000;
        System.out.println("Int Variable: " + intVariable);

        /*
         * Long
         * Min: -2463
         * Max: 2463 - 1
         * Default: 0
         */
        long longVariable = 100000000L;
        System.out.println("Long Variable: " + longVariable);

        /*
         * float
         * Default: 0.0f
         */
        float floatVariable = 20.0f;
        System.out.println("Float Variable: " + floatVariable);

        /*
         * double
         * Default: 0.0d
         */
        double doubleVariable = 60.33;
        System.out.println("Double Variable: " + doubleVariable);

        /*
         * boolean
         * false and true
         * Default: false
         */
        boolean booleanVariable = true;
        System.out.println("Boolean Variable: " + booleanVariable);

        /*
         * Char
         * Min: 0
         * Max: 65,535
         */
        char charVariable = 66;
        System.out.println("Char Variable: " + charVariable);

    }
}
