package weapons;

public abstract class WeaponBehavior {

    public void useWeapon(int anzahl) {
            draw();
            for(int i = 0; i < anzahl; i++) {
                prepare();
                aim();
                strike();
        }
            holster();
        System.out.println();
        }

    protected abstract void draw();
    protected abstract void aim();
    protected abstract void strike();
    protected abstract void holster();

    protected void prepare() {
        System.out.println("Es muss nichts vorbereitet werden");
    }


}
