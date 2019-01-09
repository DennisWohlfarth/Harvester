package Grain;

import java.util.Random;

public class Field {

    Random zufallsgenerator = new Random();
    public Wheat [][] wheat = new Wheat[1000][1000];
    public Field(){


        for(int i = 0 ; i<1000; i++)
        {
            for (int j = 0; j<1000; j++)
            {
                wheat[i][j] = new Wheat((short)(zufallsgenerator.nextInt(401)+100));

            }
        }


    }
}
