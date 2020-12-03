package com.company;

public class Warlord implements Knight {
    private static int count = 0;
    private int warlordID;
    protected float heatPoints;
    protected float attackDamage;
    protected float manaPoints;
    Warlord(float heatPoints, float attackDamage, float manaPoints){
        this.heatPoints = heatPoints;
        this.attackDamage = attackDamage;
        this.manaPoints = manaPoints;
        warlordID = ++count;
    }
    Warlord(){
    warlordID = ++count;
    }

    public void setAttackDamage(float attackDamage) {
        this.attackDamage = attackDamage;
    }

    public static void setCount(int count) {
        Warlord.count = count;
    }

    public void setHeatPoints(float heatPoints) {
        this.heatPoints = heatPoints;
    }

    public void setWarlordID(int warlordID) {
        this.warlordID = warlordID;
    }

    public void setManaPoints(float manaPoints) {
        this.manaPoints = manaPoints;
    }

    public float getAttackDamage() {
        return attackDamage;
    }

    public float getHeatPoints() {
        return heatPoints;
    }

    public float getManaPoints() {
        return manaPoints;
    }

    public static int getCount() {
        return count;
    }

    public int getWarlordID() {
        return warlordID;
    }
    @Override
    public void charge() {
        System.out.println("Warlord charges...");
    }

    @Override
    public void rush() {
        System.out.println("Warlord rushes...");
    }

    @Override
    public void battleCry() {
        System.out.println("Warlord cries...");
    }

    @Override
    public void move() {
        System.out.println("Warlord moves...");
    }

    @Override
    public String toString() {
        return "Warlord{" +
                "warlordID=" + warlordID +
                ", heatPoints=" + heatPoints +
                ", attackDamage=" + attackDamage +
                ", manaPoints=" + manaPoints +
                '}';
    }
}
