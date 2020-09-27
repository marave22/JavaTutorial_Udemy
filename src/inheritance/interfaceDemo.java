package inheritance;

public class interfaceDemo implements CarsInterface, BMWCarsInterface {

    @Override
    public void engineStart(String engineType, boolean isKeyLess) {
        System.out.println("This is the implementation");

    }

    @Override
    public void headUpNavigation() {
        System.out.println("This is the heads up navigon");
    }
}
