package Harvester;

import Grain.Field;
import Grain.Wheat;

import java.util.HashMap;
import java.util.Map;

public class Drone {

    public void scan(Field field)
    {
        Map<String, Number> grains = new HashMap<String, Number>();
        for(int i = 0 ; i<10000; i++)
        {
            for (int j = 0; j<10000; j++)
            {
                grains.put("("+i+" ,"+j+" )", field.wheat[i][j].getNumberOfGrain());
            }
            System.out.println(i);
        }
    }
}
