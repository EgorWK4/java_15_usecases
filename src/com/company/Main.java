package com.company;

public class Main {

    public static void main(String[] args) {
        Warlord warlord = new Warlord(10,10,20);
        DeadWarlord deadWarlord = new DeadWarlord(10,10,20);
        DeadKnight deadKnight = new DeadKnight(10,10,20);
        warlord.battleCry();
        System.out.println(warlord.toString());
        System.out.println(deadWarlord.toString());
        System.out.println(deadKnight.toString());

        Paladin pal = new Paladin(10,10,20);
        LightMagician lm = new LightMagician(10,10,20);
        LightOutpost outpost = new LightOutpost("Dubrava");
        outpost.addLightMagician(lm);
        outpost.addPaladin(pal);

        outpost.countTotalHP();
        outpost.showCreatures();

        LightMagician lm1 = new LightMagician(10,10,20);
        DarkSeer ds1 = new DarkSeer();

        WizardAcademy wizardAcademy = new WizardAcademy("Hogvartz");
        wizardAcademy.addDarkSeer(ds1);
        wizardAcademy.addLightMagician(lm1);
    }
}
