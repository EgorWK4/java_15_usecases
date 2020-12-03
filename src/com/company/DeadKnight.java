package com.company;

public class DeadKnight extends Undead {
    private static int count = 0;
    private int deadKnightID;
    protected float heatPoints;
    protected float attackDamage;
    protected float manaPoints;
    DeadKnight(float heatPoints, float attackDamage, float manaPoints){
        this.heatPoints = heatPoints;
        this.attackDamage = attackDamage;
        this.manaPoints = manaPoints;
        deadKnightID= ++count;
    }
    DeadKnight(){
        deadKnightID = ++count;
    }
    @Override
    void lifeSteal() {
        System.out.println("Stealing HP..");
    }

    @Override
    void raiseFromTheDead() {
        System.out.println("Rised from the dead");
    }

    @Override
    public void charge() {
        System.out.println("Dead Knight charges");
    }

    @Override
    public void rush() {
        System.out.println("Dead Knight rushes");
    }

    @Override
    public void battleCry() {
        System.out.println("Dead Knight cries");
    }

    @Override
    public void move() {
        System.out.println("Dead Knight moves");
    }

    public static int getCount() {
        return count;
    }

    public int getDeadKnightID() {
        return deadKnightID;
    }

    public float getManaPoints() {
        return manaPoints;
    }

    public float getHeatPoints() {
        return heatPoints;
    }

    public float getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(float attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setManaPoints(float manaPoints) {
        this.manaPoints = manaPoints;
    }

    public static void setCount(int count) {
        DeadKnight.count = count;
    }

    public void setHeatPoints(float heatPoints) {
        this.heatPoints = heatPoints;
    }

    public void setDeadKnightID(int deadKnightID) {
        this.deadKnightID = deadKnightID;
    }

    @Override
    public String toString() {
        return "DeadKnight{" +
                "deadKnightID=" + deadKnightID +
                ", heatPoints=" + heatPoints +
                ", attackDamage=" + attackDamage +
                ", manaPoints=" + manaPoints +
                '}';
    }
}
