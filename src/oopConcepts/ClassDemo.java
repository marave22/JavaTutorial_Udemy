package oopConcepts;

public class ClassDemo {

    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setMake("BMW");
        System.out.println("Make of BMW is: " + bmw.getMake());

//        bmw.setColor("Red");
//        System.out.println("The color of bmw: " + bmw.getColor());
//        bmw.setModel("X6");
        System.out.println("The model of BMW: " + bmw.getModel());
//        bmw.setYear(2012);
//        System.out.println("The year of bmw: " + bmw.getYear());

        Car benz = new Car();
        benz.setMake("Benz");
        System.out.println("Make of Benz is: " + benz.getMake());

        benz.setModel("c300");
        System.out.println("The model of benz: " + benz.getModel());

        benz.setYear(1800);
        System.out.println("Year of BMW is: " + benz.getYear());
        
    }
}
