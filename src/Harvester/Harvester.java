package Harvester;

import Grain.Field;

import java.util.ArrayList;

public class Harvester {
    private ArrayList<Light> lightArrayList = new ArrayList();
    private ArrayList<Wheel> wheelArrayList = new ArrayList();
    private Field field;
    public Harvester(Field field)
    {
        this.field=field;
        build();
    }

    public void build()
    {
        Cabin cabin = new Cabin();
        Bordcomputer bordcomputer = new Bordcomputer(field);
        Engine engine = new Engine();
        Grain_Tank grain_tank = new Grain_Tank();
        lightArrayList.add(new Light("Front-Light", "Front-Right", "White"));
        lightArrayList.add(new Light("Front-Light", "Front-Left", "White"));
        lightArrayList.add(new Light("Heck-Light", "Heck-Right", "Red"));
        lightArrayList.add(new Light("Heck-Light", "Heck-Left", "Red"));
        lightArrayList.add(new Light("Brake-Light", "Heck-Right", "Red"));
        lightArrayList.add(new Light("Brake-Light", "Heck-Left", "Red"));
        wheelArrayList.add(new Wheel("Continental", "Vorne-Rechts"));
        wheelArrayList.add(new Wheel("Continental", "Vorne-Links"));
        wheelArrayList.add(new Wheel("Continental", "Hinten-Rechts"));
        wheelArrayList.add(new Wheel("Continental", "Hinten-Links"));
    }

}
