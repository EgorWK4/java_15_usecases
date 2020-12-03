package com.company;

public class Paladin implements Knight, Priest{
    private static int count = 0;
    private  int PaladinID;
    protected float heatPoints;
    protected float attackDamage;
    protected float manaPoints;
    Paladin(float heatPoints, float attackDamage, float manaPoints){
        this.heatPoints = heatPoints;
        this.attackDamage = attackDamage;
        this.manaPoints = manaPoints;
        PaladinID = ++count;
    }
    Paladin(){
        PaladinID = ++count;
    }
    @Override
    public void charge() {
        System.out.println("Paladin charges");
    }

    @Override
    public void rush() {
        System.out.println("Paladin rushes");
    }

    @Override
    public void heal() {
        System.out.println("Paladin heals");
    }

    @Override
    public void inspire() {
        System.out.println("Paladin inspires");
    }

    @Override
    public void battleCry() {
        System.out.println("Paladin cries");
    }

    @Override
    public void move() {
        System.out.println("Paladin moves");

    }

    public void setAttackDamage(float attackDamage) {
        this.attackDamage = attackDamage;
    }

    public static int getCount() {
        return count;
    }

    public float getHeatPoints() {
        return heatPoints;
    }

    public int getPaladinID() {
        return PaladinID;
    }

    public float getManaPoints() {
        return manaPoints;
    }

    public float getAttackDamage() {
        return attackDamage;
    }

    public static void setCount(int count) {
        Paladin.count = count;
    }

    public void setManaPoints(float manaPoints) {
        this.manaPoints = manaPoints;
    }

    public void setHeatPoints(float heatPoints) {
        this.heatPoints = heatPoints;
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "PaladinID=" + PaladinID +
                ", heatPoints=" + heatPoints +
                ", attackDamage=" + attackDamage +
                ", manaPoints=" + manaPoints +
                '}';
    }
}
