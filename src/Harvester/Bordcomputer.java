package Harvester;

import Grain.Field;

import java.util.Scanner;
import java.util.TreeMap;

public class Bordcomputer {
    private Field field;
    TreeMap<Position, Short> grain;
    public Bordcomputer(Field field)
    {
        this.field=field;
        DroneScan();
        GrainSearch();
    }
    public void DroneScan()
    {
        Drone drone= new Drone(field);
        grain = drone.scan();

        for (Position grainposition : grain.keySet())
            System.out.println("Position: "+grainposition.getX()+ "/" +grainposition.getY()+" Anzahl Körner: "+ grain.get(grainposition));

    }
    public void GrainSearch()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n\nEingabe X-Wert: ");
        int eingabeX = scanner.nextInt();
        System.out.print("Eingabe Y-Wert: ");
        int eingabeY = scanner.nextInt();

        for (Position grainposition : grain.keySet())
        {
            if(grainposition.getX()==eingabeX && grainposition.getY()==eingabeY)
            {
                System.out.println("\nAnzahl Körner "+ grain.get(grainposition));
            }
        }
        GrainSearch();
    }
}
