package weapons;

public class BowAndArrow extends WeaponBehavior {


    @Override
    protected void draw() {
        System.out.println("Der Bogen wird herausgeholt");
    }

    @Override
    protected void prepare() {
        System.out.println("Es wird ein Pfeil aus dem Köcher gezogen");
    }

    @Override
    protected void aim() {
        System.out.println("Es wird mit dem Bogen auf den Feind gezielt");
    }

    @Override
    protected void strike() {
        System.out.println("Der Pfeil wird abgefeuert");
    }

    @Override
    protected void holster() {
        System.out.println("Der Bogen wird zurückgelegt");
    }
}
