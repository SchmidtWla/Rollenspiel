package weapons;

public class Axe extends WeaponBehavior {



    @Override
    protected void draw() {
        System.out.println("Die Axt wird gezogen");
    }

    @Override
    protected void aim() {
        System.out.println("Es wird mit der Axt gezielt");
    }

    @Override
    protected void strike() {
        System.out.println("Es wird mit der Axt zugeschlagen");
    }

    @Override
    protected void holster() {
        System.out.println("Die Axt wird zurückgelegt");
    }
}
