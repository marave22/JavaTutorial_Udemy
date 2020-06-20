package oopConcepts;

public class Car1 {
    private String make;
    int speed;
    int gear;

    public Car1() {
        this(10, 2);
        this.speed = 0;
        this.gear = 0;
        System.out.println("Executing constructor without argument");
    }

    public Car1 (int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        System.out.println("Executing constructor with argument");
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }
}
