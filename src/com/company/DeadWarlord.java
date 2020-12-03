package com.company;

public class DeadWarlord extends Undead{
    private static int count = 0;
    private int DeadWarlordID;
    protected float heatPoints;
    protected float attackDamage;
    protected float manaPoints;
    DeadWarlord(float heatPoints, float attackDamage, float manaPoints){
        this.heatPoints = heatPoints;
        this.attackDamage = attackDamage;
        this.manaPoints = manaPoints;
        DeadWarlordID = ++count;
    }
    DeadWarlord(){
        DeadWarlordID = ++count;
    }

    public void setHeatPoints(float heatPoints) {
        this.heatPoints = heatPoints;
    }

    public static void setCount(int count) {
        DeadWarlord.count = count;
    }

    public void setManaPoints(float manaPoints) {
        this.manaPoints = manaPoints;
    }

    public void setAttackDamage(float attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setDeadWarlordID(int deadWarlordID) {
        DeadWarlordID = deadWarlordID;
    }

    @Override
    void lifeSteal() {
        System.out.println("Dead warlord steals HP");
    }

    @Override
    void raiseFromTheDead() {
        System.out.println("Dead Warlord rises from the dead");
    }

    public float getAttackDamage() {
        return attackDamage;
    }

    public static int getCount() {
        return count;
    }

    public float getHeatPoints() {
        return heatPoints;
    }

    public int getDeadWarlordID() {
        return DeadWarlordID;
    }

    public float getManaPoints() {
        return manaPoints;
    }

    @Override
    public void charge() {
        System.out.println("Dead Warlord charges");
    }

    @Override
    public void rush() {
    System.out.println("Dead Warlord rushes");
    }

    @Override
    public String toString() {
        return "DeadWarlord{" +
                "DeadWarlordID=" + DeadWarlordID +
                ", heatPoints=" + heatPoints +
                ", attackDamage=" + attackDamage +
                ", manaPoints=" + manaPoints +
                '}';
    }

    @Override
    public void battleCry() {
        System.out.println("Dead warlord cries");

    }

    @Override
    public void move() {
    System.out.println("Dead warlord moves");
    }
}
