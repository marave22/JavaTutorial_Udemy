package inheritance;

public class Cars {
    // No Modifier - accessible in the same package
    int speed;
    // Only in class
    private int privateSpeed;

    // Anywhere in Java with importing the package and class
    public int publicSpeed;

    // In same package and in sub classes
    protected int protectedSpeed;
    int speedLimit = 100;

    public Cars () {
        this(0);
    }

    public void setPrivateSpeed(int pSpeed) {
        privateSpeed = pSpeed;
    }

    public Cars (int startSpeed) {
        speed = startSpeed;
    }

    public void increaseSpeed() {
        if (speed < 100) {
            speed++;
        }
        System.out.println("Increase Speed of Cars ");
    }
    protected void decreaseSpeed() {
        speed--;
        System.out.println("Decrease Speed of Cars");
    }
}
