package com.company;

public class DarkSeer implements Wizard, Rogue{
    @Override
    public void backStab() {
        System.out.println("Dark Seer backstabes");
    }

    @Override
    public void vanish() {
        System.out.println("Dark Seer vanishes");
    }

    @Override
    public void castDefenceSpell() {
        System.out.println("Dark seer casts defence spell");
    }

    @Override
    public void castAttackSpell() {
        System.out.println("Dark seer casts attack spell");
    }

    @Override
    public void battleCry() {
        System.out.println("Dark seer cries");
    }

    @Override
    public void move() {
        System.out.println("Dark seer moves");
    }
}
