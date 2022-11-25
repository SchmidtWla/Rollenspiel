package charaters;

import weapons.WeaponBehavior;

public abstract class Character {

    protected WeaponBehavior currentWeapon;

    private int anzahlAttacken;

    public int getAnzahlAttacken() {
        return anzahlAttacken;
    }

    public Character(WeaponBehavior weaponBehavior, int anzahlAttacken) {
        this.currentWeapon = weaponBehavior;
        this.anzahlAttacken = anzahlAttacken;
    }

    public void setCurrentWeapon(WeaponBehavior currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public void fight() {
        currentWeapon.useWeapon(anzahlAttacken);
    }

}
