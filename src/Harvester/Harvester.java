package Harvester;

import java.util.ArrayList;

public class Harvester {
    private ArrayList<Light> lightArrayList;
    private ArrayList<Wheel> wheelArrayList;
    public Harvester()
    {
        build();
    }

    public void build()
    {
        Cabin cabin = new Cabin();
        Bordcomputer bordcomputer = new Bordcomputer();
        Engine engine = new Engine();
        Grain_Tank grain_tank = new Grain_Tank();
        lightArrayList.add(new Light());
        lightArrayList.add(new Light());
        lightArrayList.add(new Light());
        lightArrayList.add(new Light());
        wheelArrayList.add(new Wheel("Continental", "Vorne-Rechts"));
        wheelArrayList.add(new Wheel("Continental", "Vorne-Links"));
        wheelArrayList.add(new Wheel("Continental", "Hinten-Rechts"));
        wheelArrayList.add(new Wheel("Continental", "Hinten-Links"));
    }
}
