package com.company;
import java.util.*;

public class WizardAcademy {
    protected ArrayList<DarkSeer> darkSeers= new ArrayList<>();
    protected ArrayList<LightMagician> lightMagicians= new ArrayList<>();
    protected String academyName;
    void addDarkSeer(DarkSeer object)
    {
        darkSeers.add(object);
    }
    void addLightMagician(LightMagician object)
    {
        lightMagicians.add(object);
    }
    WizardAcademy(String academyName)
    {
        this.academyName = academyName;
    }

    public void setLightMagicians(ArrayList<LightMagician> lightMagicians) {
        this.lightMagicians = lightMagicians;
    }

    public void setAcademyName(String academyName) {
        this.academyName = academyName;
    }

    public void setDarkSeers(ArrayList<DarkSeer> darkSeers) {
        this.darkSeers = darkSeers;
    }

    public ArrayList<DarkSeer> getDarkSeers() {
        return darkSeers;
    }

    public ArrayList<LightMagician> getLightMagicians() {
        return lightMagicians;
    }

    public String getAcademyName() {
        return academyName;
    }

    @Override
    public String toString() {
        return "WizardAcademy{" +
                "darkSeers=" + darkSeers +
                ", lightMagicians=" + lightMagicians +
                ", academyName='" + academyName + '\'' +
                '}';
    }
}
