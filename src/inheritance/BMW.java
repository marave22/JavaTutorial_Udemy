package inheritance;

public class BMW extends Cars {

    public BMW (int startSpeed) {
        super(startSpeed);
    }

    @Override
    public void increaseSpeed() {
//        super.increaseSpeed();
        protectedSpeed++;
        Cars c1 = new Cars();
        c1.decreaseSpeed();
        System.out.println("Increase speed of BMW");
    }

    public void headupDisplayNavigation() {
        System.out.println("BMW Specific functionality");
    }



//    public void increaseSpeed(int speed) {
//
//    }
}
