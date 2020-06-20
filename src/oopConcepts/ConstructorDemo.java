package oopConcepts;

public class ConstructorDemo {
    public static void main(String[] args) {
        Car1 c1 = new Car1();

        c1.setMake("BMW");
        System.out.println(c1.getMake());

        System.out.println(c1.speed);
        System.out.println(c1.gear);

        System.out.println("******************");

        Car1 c2 = new Car1(10, 1);
        System.out.println(c2.speed);
        System.out.println(c2.gear);


    }
}
