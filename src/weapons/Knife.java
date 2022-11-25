package weapons;

public class Knife extends WeaponBehavior {


    @Override
    protected void draw() {
        System.out.println("Das Messer wird gezogen");
    }

    @Override
    protected void aim() {
        System.out.println("Es wird mit dem Messer auf den Gegner gezielt");
    }

    @Override
    protected void strike() {
        System.out.println("Es wird mit dem Messer zugestochen");
    }

    @Override
    protected void holster() {
        System.out.println("Das Messer wandert zurück in die Tasche");
    }
}
