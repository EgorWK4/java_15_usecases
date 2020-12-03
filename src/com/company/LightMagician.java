package com.company;

public class LightMagician implements Wizard {
    private static int count = 0;
    private  int LightMagicianID;
    protected float heatPoints;
    protected float attackDamage;
    protected float manaPoints;
    LightMagician(float heatPoints, float attackDamage, float manaPoints){
        this.heatPoints = heatPoints;
        this.attackDamage = attackDamage;
        this.manaPoints = manaPoints;
        LightMagicianID = ++count;
    }
    LightMagician(){
        LightMagicianID = ++count;
    }
    @Override
    public void castDefenceSpell() {
        System.out.println("Light Magician casts defence spell");
    }

    @Override
    public void castAttackSpell() {
        System.out.println("Light Magician casts attack spell");

    }


    @Override
    public void battleCry() {
        System.out.println("Light Magician cries");

    }

    @Override
    public void move() {
        System.out.println("Light Magician moves");
    }

    public float getAttackDamage() {
        return attackDamage;
    }

    public float getManaPoints() {
        return manaPoints;
    }

    public float getHeatPoints() {
        return heatPoints;
    }

    public int getLightMagicianID() {
        return LightMagicianID;
    }

    public static int getCount() {
        return count;
    }

    public void setAttackDamage(float attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setHeatPoints(float heatPoints) {
        this.heatPoints = heatPoints;
    }

    public void setManaPoints(float manaPoints) {
        this.manaPoints = manaPoints;
    }

    public static void setCount(int count) {
        LightMagician.count = count;
    }

    public void setLightMagicianID(int lightMagicianID) {
        LightMagicianID = lightMagicianID;
    }

    @Override
    public String toString() {
        return "LightMagician{" +
                "LightMagicianID=" + LightMagicianID +
                ", heatPoints=" + heatPoints +
                ", attackDamage=" + attackDamage +
                ", manaPoints=" + manaPoints +
                '}';
    }
}
