package charaters;

import weapons.WeaponBehavior;

public class Ritter extends Character{
    public Ritter(WeaponBehavior weaponBehavior) {
        super(weaponBehavior,2);
    }
    @Override
    public void fight() {
        this.currentWeapon.useWeapon(getAnzahlAttacken());
    }
}
