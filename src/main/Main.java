package main;

import charaters.King;
import charaters.Ritter;
import weapons.Axe;
import weapons.Knife;

public class Main {

    public static void main(String[] args) {
        Ritter ritter = new Ritter(new Axe());
        ritter.fight();

        King king = new King(new Knife());
        king.fight();
    }
}
