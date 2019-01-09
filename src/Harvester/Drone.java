package Harvester;

import Grain.Field;

import java.util.*;

public class Drone {
    private static boolean ASC = true;
    private Field field;
    public Drone(Field field)
    {
        this.field=field;
    }

    public  TreeMap<Position, Short> scan()
    {
        TreeMap<Position, Short> grain = new TreeMap<Position, Short>();
        grain = new TreeMap<>(new Comparator<Position>() {
            @Override //Override Compare Func
            public int compare(Position position1, Position position2) {
                if(field.wheat[position1.getX()][position1.getY()].getNumberOfGrain() == field.wheat[position2.getX()][position2.getY()].getNumberOfGrain()){
                    if (position1.getY() == position2.getX()){
                        return position1.getY() - position2.getY();
                    }
                    else return position1.getX() -position2.getX();
                }
                else return field.wheat[position2.getX()][position2.getY()].getNumberOfGrain() - field.wheat[position1.getX()][position1.getY()].getNumberOfGrain();
            }
        });
        Map<String, Integer> grains = new HashMap<String, Integer>();
        for(int i = 0 ; i<1000; i++)
        {
            for (int j = 0; j<1000; j++)
            {
                field.wheat[i][j].setPosition(new Position(i,j));
                grain.put(new Position(i,j),field.wheat[i][j].getNumberOfGrain());
            }
        }
        return grain;
    }

}
