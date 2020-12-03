package com.company;
import java.util.*;
public class LightOutpost extends ServantsOfTheLight{

    @Override
    void showCreatures() {
        System.out.println("Light outpost creatures are : /n");
        for(Paladin paladin : paladins) {
            System.out.println(paladin.toString());
        }
        for(LightMagician lm : lightMagicians)
        {
            System.out.println(lm.toString());
        }
    }

    @Override
    void countTotalHP() {
        double sum = 0;
        for(Paladin paladin : paladins)
        {
            sum+= paladin.getHeatPoints();
        }
        for(LightMagician lm : lightMagicians)
        {
            sum+= lm.getHeatPoints();
        }
        System.out.println("Total Heat points in Light Outpost:/n");
        System.out.println(sum);
    }

    @Override
    public void heal() {

    }

    @Override
    public void inspire() {

    }

    @Override
    public void battleCry() {

    }

    @Override
    public void move() {

    }
    protected String outpostName;
    protected  ArrayList<Paladin> paladins = new ArrayList<>();
    protected ArrayList<LightMagician> lightMagicians = new ArrayList<>();
    void addPaladin(Paladin object)
    {
        paladins.add(object);
    }
    void addLightMagician(LightMagician object)
    {
        lightMagicians.add(object);
    }
    void deletePaladin(Paladin object){
        paladins.removeIf(pal -> pal.getPaladinID() == object.getPaladinID());
    }
    void deleteLightMagician(LightMagician object){
        lightMagicians.removeIf(lm -> lm.getLightMagicianID() == object.getLightMagicianID());
    }
    LightOutpost(String outpostName) {
        this.outpostName = outpostName;
    }

    public ArrayList<LightMagician> getLightMagicians() {
        return lightMagicians;
    }

    public ArrayList<Paladin> getPaladins() {
        return paladins;
    }

    public String getOutpostName() {
        return outpostName;
    }

    @Override
    public String toString() {
        return "LightOutpost{" +
                "outpostName='" + outpostName + '\'' +
                ", paladins=" + paladins +
                ", lightMagicians=" + lightMagicians +
                '}';
    }

    public void setLightMagicians(ArrayList<LightMagician> lightMagicians) {
        this.lightMagicians = lightMagicians;
    }

    public void setOutpostName(String outpostName) {
        this.outpostName = outpostName;
    }

    public void setPaladins(ArrayList<Paladin> paladins) {
        this.paladins = paladins;
    }

}
