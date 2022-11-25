package weapons;

import jdk.swing.interop.SwingInterOpUtils;

public class Sword extends WeaponBehavior {

    @Override
    protected void draw() {
        System.out.println("Das Schwert wird gezogen");
    }

    @Override
    protected void aim() {
        System.out.println("Es wird mit dem Schwert gezielt");
    }

    @Override
    protected void strike() {
        System.out.println("Es wird mit dem Schwert geschlagen");
    }

    @Override
    protected void holster() {
        System.out.println("Das Schwert wird zurückgelegt");
    }
}
